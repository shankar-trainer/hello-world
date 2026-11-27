## JSONB in PostgreSQL

JSONB (JSON Binary) is a PostgreSQL data type used to store JSON data in a binary format. It allows you to store, query, filter, and update JSON documents efficiently.

PostgreSQL supports two JSON data types:

| Feature | JSON | JSONB |
| --- | --- | --- |
| Storage | Stores original JSON text | Stores decomposed binary format |
| Query performance | Generally slower | Generally faster |
| Indexing | Limited | Supports GIN indexes |
| Preserves key order | Yes | No |
| Preserves duplicate keys | Yes | No |
| Best for | Storing raw JSON | Querying and manipulating JSON |

## 1. Creating a table with JSONB

sql

```sql
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    details JSONB
);
```

## 2. Inserting JSONB data

sql

```sql
INSERT INTO users (name, details)
VALUES (
    'John',
    '{
        "age": 25,
        "city": "Delhi",
        "skills": ["Java", "PostgreSQL"],
        "active": true
    }'
);
```

## 3. Reading JSONB data

Get the complete JSON:

sql

```sql
SELECT details FROM users;
```

Get a specific field using `->`:

sql

```sql
SELECT details -> 'city'
FROM users;
```

Returns JSON:

json

```json
"Delhi"
```

Get a field as text using `->>`:

sql

```sql
SELECT details ->> 'city'
FROM users;
```

Returns:

text

```text
Delhi
```

Get nested JSON values:

sql

```sql
SELECT details -> 'address' ->> 'city'
FROM users;
```

## 4. Filtering JSONB data

Find users whose city is Delhi:

sql

```sql
SELECT *
FROM users
WHERE details ->> 'city' = 'Delhi';
```

Find users whose age is greater than 20:

sql

```sql
SELECT *
FROM users
WHERE (details ->> 'age')::INT > 20;
```

## 5. Updating JSONB data

Use `jsonb_set()`:

sql

```sql
UPDATE users
SET details = jsonb_set(
    details,
    '{city}',
    '"Mumbai"'
)
WHERE id = 1;
```

Add a new property:

sql

```sql
UPDATE users
SET details = details || '{"country": "India"}'::JSONB
WHERE id = 1;
```

## 6. Deleting a JSONB property

Use the `-` operator:

sql

```sql
UPDATE users
SET details = details - 'city'
WHERE id = 1;
```

## 7. Checking whether a JSONB key exists

Use the `?` operator:

sql

```sql
SELECT *
FROM users
WHERE details ? 'age';
```

## 8. JSONB containment operator

Use `@>` to check whether JSONB contains specific JSON data.

sql

```sql
SELECT *
FROM users
WHERE details @> '{"city": "Delhi"}';
```

This is particularly useful when filtering JSON documents.

## 9. Working with JSONB arrays

Suppose the JSONB data contains:

json

```json
{
  "skills": ["Java", "Python", "PostgreSQL"]
}
```

Check whether an array contains PostgreSQL:

sql

```sql
SELECT *
FROM users
WHERE details -> 'skills' @> '["PostgreSQL"]'::JSONB;
```

Convert JSONB array elements into rows:

sql

```sql
SELECT jsonb_array_elements(details -> 'skills')
FROM users;
```

## 10. JSONB indexing for performance

For large tables, create a GIN index:

sql

```sql
CREATE INDEX idx_users_details
ON users
USING GIN (details);
```

This can improve queries using JSONB containment and key-existence operators.

## Important JSONB operators

| Operator | Purpose | Example | |---|---|---| | `->` | Get JSON object field | `details -> 'age'` | | `->>` | Get field as text | `details ->> 'age'` | | `#>` | Get nested JSON | `details #> '{address,city}'` | | `#>>` | Get nested text | `details #>> '{address,city}'` | | `@>` | Contains | `details @> '{"age":25}'` | | `<@` | Is contained by | `details <@ '{"age":25,"city":"Delhi"}'` | | `?` | Check key exists | `details ? 'age'` | | `||` | Merge JSONB | `details || '{"age":30}'` | | `-` | Remove key | `details - 'age'` | | `#-` | Remove nested field | `details #- '{address,city}'` |

## When should you use JSONB?

Use JSONB when:

- Your data structure changes frequently.
- You have dynamic attributes.
- You need to store API request/response payloads.
- You need to query nested JSON properties.
- You want flexible schema design.

My recommendation: Use JSONB for flexible or dynamic data, but keep frequently queried and important relational fields (such as user ID, email, status) in regular PostgreSQL columns.

Would you like to learn PostgreSQL JSONB with real-world examples, advanced queries, and interview questions?