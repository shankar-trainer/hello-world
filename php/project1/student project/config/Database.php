<?php
class Database
{
    protected $conn;
    private $host = "localhost";
    private $user = "root";
    private $pass = "mysql";
    private $dbname = "db3";

    public function __construct()
    {
        $this->conn = new mysqli($this->host, $this->user, $this->pass, $this->dbname);

        if ($this->conn->connect_error) {
            die("Database Connection Failed");
        }
    }
}
