const express = require('express');
const mysql = require('mysql2');
const cors = require('cors');
const app = express();
const port = 3000;
// Middleware
app.use(cors());
app.use(express.json());
// MySQL connection
const connection = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: 'mysql',
  database: 'pagination_demo'
});
connection.connect((err) => {
  if (err) {
    console.error('Database connection failed:', err.stack);
    return;
  }
  console.log('Connected to MySQL');
});
// API to fetch paginated data
app.get('/items', (req, res) => {
  const page = parseInt(req.query.page) || 1;
  const limit = parseInt(req.query.limit) || 10;
  const offset = (page - 1) * limit;
  connection.query(
    'SELECT SQL_CALC_FOUND_ROWS * FROM items LIMIT ?, ?', [offset, limit],
    (err, results) => {
      if (err) throw err;
      // Get the total number of records
      connection.query('SELECT FOUND_ROWS() AS total', (err, totalResults) => {
        if (err) throw err;
        res.json({
          total: totalResults[0].total,
          data: results
        });
      });
    }
  );
});
app.listen(port, () => {
  console.log(`Server running on http://localhost:${port}`);
});
