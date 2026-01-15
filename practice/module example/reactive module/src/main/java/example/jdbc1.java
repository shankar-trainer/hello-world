package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class SqlExample {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/db9";
    private static final String USER = "root";
    private static final String PASS = "mysql";

    public void connectAndQuery() {
        // Establishes a connection to the database
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            System.out.println("Connection successful!");

            // SQL query
            String sql = "SELECT id, full_name FROM PERSON WHERE id = ?";

            // Creates a PreparedStatement to execute parameterized queries
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, 1);

                // Executes the query and gets the results
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String name = rs.getString("full_name");
                        System.out.println("ID: " + id + ", Name: " + name);
                    }
                }
            }

        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SqlExample app = new SqlExample();
        app.connectAndQuery();
    }
}
