module test1 {
    requires java.sql;
    // If using a modular JDBC driver like MySQL Connector/J:
    // requires com.mysql.cj.jdbc;

    requires reactor.core;
    exports  example;
}
