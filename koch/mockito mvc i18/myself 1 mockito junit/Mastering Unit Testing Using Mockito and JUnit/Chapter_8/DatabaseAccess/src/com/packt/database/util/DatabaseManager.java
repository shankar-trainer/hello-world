package com.packt.database.util;
/*

   Derby - Class DatabaseManager

   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DatabaseManager
{
    /* the default framework is embedded*/
    private String framework = "embedded";
    private String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    private String protocol = "jdbc:derby:";
    public static void main(String[] args)
    {
        new DatabaseManager().go(args);
        System.out.println("DatabaseManager finished");
    }

    
    void go(String[] args)
    {
        parseArguments(args);
        System.out.println("DatabaseManager starting in " + framework + " mode");
        loadDriver();
        Connection conn = null;
        Statement statement = null;
        try
        {
            Properties props = new Properties(); // connection properties
            props.put("user", "dbo");
            props.put("password", "");
            String dbName = "derbyDB"; // the name of the database
            String url = protocol + dbName
                    + ";create=true";
            System.out.println("URL="+url);
			conn = DriverManager.getConnection(url, props);

            System.out.println("Connected to and created database " + dbName);
            conn.setAutoCommit(false);
            statement = conn.createStatement();
            statement.execute("create table PhoneBook(num varchar(50), fname varchar(40),lname varchar(40))");
            System.out.println("Created table PhoneBook");
            conn.commit();
            System.out.println("Committed the transaction");

          
            if (framework.equals("embedded"))
            {
                try
                {
                    DriverManager.getConnection("jdbc:derby:;shutdown=true");

                }
                catch (SQLException se)
                {
                    if (( (se.getErrorCode() == 50000)
                            && ("XJ015".equals(se.getSQLState()) ))) {
                        System.out.println("Derby shut down normally");
                    } else {
                        System.err.println("Derby did not shut down normally");
                        printSQLException(se);
                    }
                }
            }
        }
        catch (SQLException sqle)
        {
            printSQLException(sqle);
            if(conn != null) {
				try {
					conn.rollback();
					System.out.println("\tConnection rolledback");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
        } finally {
            // release all open resources to avoid unnecessary memory usage

            if (statement != null) {
                try {
                    if (statement != null) {
                    	statement.close();
                    	statement = null;
                    }
                } catch (SQLException sqle) {
                    printSQLException(sqle);
                }
            }

            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("\tConnection closed");
                    conn = null;
                }
            } catch (SQLException sqle) {
                printSQLException(sqle);
            }
        }
    }

    private void loadDriver() {
        try {
            Class.forName(driver).newInstance();
            System.out.println("Loaded the appropriate driver");
        } catch (ClassNotFoundException cnfe) {
            System.err.println("\nUnable to load the JDBC driver " + driver);
            System.err.println("Please check your CLASSPATH.");
            cnfe.printStackTrace(System.err);
        } catch (InstantiationException ie) {
            System.err.println(
                        "\nUnable to instantiate the JDBC driver " + driver);
            ie.printStackTrace(System.err);
        } catch (IllegalAccessException iae) {
            System.err.println(
                        "\nNot allowed to access the JDBC driver " + driver);
            iae.printStackTrace(System.err);
        }
    }


    public static void printSQLException(SQLException e)
    {
        while (e != null)
        {
            System.err.println("\n----- SQLException -----");
            System.err.println("  SQL State:  " + e.getSQLState());
            System.err.println("  Error Code: " + e.getErrorCode());
            System.err.println("  Message:    " + e.getMessage());
            e = e.getNextException();
        }
    }
    private void parseArguments(String[] args)
    {
        if (args.length > 0) {
            if (args[0].equalsIgnoreCase("derbyclient"))
            {
                framework = "derbyclient";
                driver = "org.apache.derby.jdbc.ClientDriver";
                protocol = "jdbc:derby://localhost:1527/";
            }
        }
    }
}
