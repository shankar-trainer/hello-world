window 
open terminal 

bin\psql -U postregs

sudo systemctl start postgresql
SELECT current_database();

\l
\list    will list all databases
\c databasename   -- will  connect with database
create database  databasename -- add  command in capital terminated  with semi colon    
                              -- create database      
\dt -- show all tables 
create table tablename (colname datatype, colname datatype )-- create table 
\d+ tablename -- structure of the table 
capg1=# create table employee (id bigserial primary key, name varchar(20), salary float, dob date);
capg1=# insert into employee  (name,salary,dob) values  ('hemant kumar',12000,'1999-01-11');
capg1=# insert into employee  (name,salary,dob) values ('sumit kumar',18000,'1991-10-12'), ('anil kumar',78000,'1982-10-10'), ('pritam kumar',56000,'1983-09-25');
                                          
capg1=# select * from employee

=====================================

sudo systemctl start postgresql
sudo -u postgres psql

CREATE  database db1; # COMMAND IN CAPITAL  

ALTER DATABASE db2 OWNER TO db1;

CREATE DATABASE db2 OWNER db2; → Creates a database owned by db2.

CREATE USER db2 WITH PASSWORD '1234'; → Creates a login role named db2.

# Set or reset the postgres password On Ubuntu/Linux:


bash
sudo -u postgres psql

Then execute:


sql
ALTER USER postgres WITH PASSWORD 'your_new_password';
ALTER USER postgres WITH PASSWORD 'postgresql';
Exit:


sql
\q
Test login

bash
psql -U postgres -h localhost -W


#use postgresql as alternative of mongodb

Yes! You can use PostgreSQL as an alternative to MongoDB. PostgreSQL is a powerful relational database, but it also supports document-oriented storage using the JSONB data type.

In many applications, PostgreSQL can completely replace MongoDB.

1. MongoDB vs PostgreSQL
Feature

MongoDB

PostgreSQL

Database type

NoSQL

Relational + JSON

Data format

BSON documents

Rows + JSONB

Schema

Flexible

Structured or flexible

Relationships

Embedded/references

Foreign keys and JOINs

Transactions

Supported

Supported

Indexing

Yes

Yes

Aggregation

Aggregation pipeline

SQL queries

JSON support

Native

JSON and JSONB

2. Store MongoDB-like documents in PostgreSQL
You can use JSONB to store documents just like MongoDB.


sql
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    data JSONB
);
Insert a document:


sql
INSERT INTO users (data)
VALUES (
    '{
        "name": "John",
        "email": "john@example.com",
        "age": 25,
        "skills": ["Node.js", "React"]
    }'
);
Fetch documents:


sql
SELECT * FROM users;
Query JSON fields:


sql
SELECT *
FROM users
WHERE data->>'name' = 'John';
Update JSON fields:


sql
UPDATE users
SET data = jsonb_set(data, '{age}', '26')
WHERE data->>'name' = 'John';
3. MongoDB operations vs PostgreSQL
MongoDB

PostgreSQL

insertOne()

INSERT INTO

find()

SELECT

findOne()

SELECT ... LIMIT 1

updateOne()

UPDATE

deleteOne()

DELETE

aggregate()

SQL aggregation / JSONB queries

Collection

Table

Document

Row / JSONB value

4. Using PostgreSQL with Node.js
Install:


bash
npm install pg
Connect:


javascript
const { Pool } = require("pg");

const pool = new Pool({
    user: "postgres",
    host: "localhost",
    database: "mydb",
    password: "your_password",
    port: 5432
});

async function getUsers() {
    const result = await pool.query(
        "SELECT * FROM users"
    );

    console.log(result.rows);
}

getUsers();
5. When should you choose PostgreSQL?
PostgreSQL: E-commerce, ERP, CRM, banking, SaaS, user management, inventory and applications with relationships.

MongoDB: Applications that heavily depend on flexible document structures and MongoDB-specific features.

My recommendation
For most new Node.js applications, I would recommend PostgreSQL + JSONB instead of MongoDB.

You get:

SQL and relational database capabilities.

Flexible JSON document storage.

Powerful joins and transactions.

Data integrity through constraints.

A single database for relational and document-oriented data.

You can even use Prisma ORM with PostgreSQL to make database operations easier, similar to using Mongoose with MongoDB.


