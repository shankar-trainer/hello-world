const express = require('express');
const { Pool } = require('pg');

const app = express();

app.use(express.json());

const pool = new Pool({
    user: 'postgres',
    host: 'localhost',
    database: 'postgres',
    password: 'postgresql',
    port: 5432
});

pool.connect()
    .then(() => {
        console.log("PostgreSQL connected successfully");
    })
    .catch((err) => {
        console.log(err);
    });


// Insert JSON data
app.post('/users', async (req, res) => {
    try {
        const userData = req.body;

        const result = await pool.query(
            'INSERT INTO users (user_data) VALUES ($1) RETURNING *',
            [JSON.stringify(userData)]
        );

        res.json(result.rows[0]);

    } catch (error) {
        res.status(500).json({ error: error.message });
    }
});

// Get all JSON data
//http://localhost:4000/users

app.get('/users', async (req, res) => {
    try {
        const result = await pool.query(
            'select * from USERS'
        );

        res.json(result.rows);

    } catch (error) {
        res.status(500).json({ error: error.message });
        console.log(error)
    }
});

app.listen(4000, () => {
    console.log('Server running on port 4000');
});
