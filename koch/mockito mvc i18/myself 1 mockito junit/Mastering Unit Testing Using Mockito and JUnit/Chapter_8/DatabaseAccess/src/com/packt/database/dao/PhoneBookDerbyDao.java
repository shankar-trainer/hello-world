package com.packt.database.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.packt.database.model.PhoneEntry;

public class PhoneBookDerbyDao implements PhoneBookDao {
	public static final String INSERT_INTO_PHONE_BOOK_VALUES = "insert into PhoneBook values (?,?,?)";
	private String driver = "org.apache.derby.jdbc.EmbeddedDriver";
	private String protocol = "jdbc:derby:";
	private String userId = "dbo";
	private String dbName = "derbyDB";

	public PhoneBookDerbyDao() {
		loadDriver();
	}

	protected void loadDriver() {
		try {
			Class.forName(driver).newInstance();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace(System.err);
		} catch (InstantiationException ie) {
			ie.printStackTrace(System.err);
		} catch (IllegalAccessException iae) {
			iae.printStackTrace(System.err);
		}
	}

	protected Connection getConnection() throws SQLException {
		Connection conn = null;
		Properties props = new Properties(); // connection properties
		props.put("user", userId);
		conn = DriverManager.getConnection(protocol + dbName + ";create=true",
				props);
		conn.setAutoCommit(false);
		return conn;
	}

	@Override
	public boolean create(PhoneEntry entry) {
		PreparedStatement preparedStmt = null;
		Connection conn = null;
		try {
			conn = getConnection();
			preparedStmt = conn
					.prepareStatement(INSERT_INTO_PHONE_BOOK_VALUES);

			preparedStmt.setString(1, entry.getPhoneNumber());
			preparedStmt.setString(2, entry.getFirstName());
			preparedStmt.setString(3, entry.getLastName());

			preparedStmt.executeUpdate();
			conn.commit();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			if(conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		} finally {

			if (preparedStmt != null) {
				try {
					preparedStmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return false;
	}

	@Override
	public boolean update(PhoneEntry entryToUpdate) {

		PreparedStatement preparedStmt = null;
		Connection conn = null;
		try {
			conn = getConnection();
			preparedStmt = conn
					.prepareStatement("update PhoneBook set fname=?, lname=? where num=?");

			preparedStmt.setString(1, entryToUpdate.getFirstName());
			preparedStmt.setString(2, entryToUpdate.getLastName());
			preparedStmt.setString(3, entryToUpdate.getPhoneNumber());

			preparedStmt.executeUpdate();
			conn.commit();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			if(conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		} finally {

			if (preparedStmt != null) {
				try {
					preparedStmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return false;
	}

	@Override
	public List<PhoneEntry> searchByNumber(String number) {
		PreparedStatement preparedStmt = null;
		Connection conn = null;
		ResultSet resultSet = null;
		List<PhoneEntry> entries = new ArrayList<PhoneEntry>();
		try {
			conn = getConnection();
			preparedStmt = conn
					.prepareStatement("SELECT * FROM PhoneBook where num=?");

			preparedStmt.setString(1, number);
			resultSet = preparedStmt.executeQuery();
			while (resultSet.next()) {
				PhoneEntry entry = new PhoneEntry();
				entry.setFirstName(resultSet.getString("fname"));
				entry.setLastName(resultSet.getString("lname"));
				entry.setPhoneNumber(resultSet.getString("num"));
				entries.add(entry);
			}
			conn.commit();
			return entries;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			 try {
	                if (resultSet != null) {
	                	resultSet.close();
	                	resultSet = null;
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }

			if (preparedStmt != null) {
				try {
					preparedStmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public List<PhoneEntry> searchByFirstName(String firstName) {
		PreparedStatement preparedStmt = null;
		Connection conn = null;
		ResultSet resultSet = null;
		List<PhoneEntry> entries = new ArrayList<PhoneEntry>();
		try {
			conn = getConnection();
			preparedStmt = conn
					.prepareStatement("SELECT * FROM PhoneBook where fname=?");

			preparedStmt.setString(1, firstName);
			resultSet = preparedStmt.executeQuery();
			while (resultSet.next()) {
				PhoneEntry entry = new PhoneEntry();
				entry.setFirstName(resultSet.getString("fname"));
				entry.setLastName(resultSet.getString("lname"));
				entry.setPhoneNumber(resultSet.getString("num"));
				entries.add(entry);
			}
			conn.commit();
			return entries;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			 try {
	                if (resultSet != null) {
	                	resultSet.close();
	                	resultSet = null;
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }

			if (preparedStmt != null) {
				try {
					preparedStmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public List<PhoneEntry> searchByLastName(String lastName) {
		PreparedStatement preparedStmt = null;
		Connection conn = null;
		ResultSet resultSet = null;
		List<PhoneEntry> entries = new ArrayList<PhoneEntry>();
		try {
			conn = getConnection();
			preparedStmt = conn
					.prepareStatement("SELECT * FROM PhoneBook where lname=?");

			preparedStmt.setString(1, lastName);
			resultSet = preparedStmt.executeQuery();
			while (resultSet.next()) {
				PhoneEntry entry = new PhoneEntry();
				entry.setFirstName(resultSet.getString("fname"));
				entry.setLastName(resultSet.getString("lname"));
				entry.setPhoneNumber(resultSet.getString("num"));
				entries.add(entry);
			}
			conn.commit();
			return entries;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			 try {
	                if (resultSet != null) {
	                	resultSet.close();
	                	resultSet = null;
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }

			if (preparedStmt != null) {
				try {
					preparedStmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public boolean delete(String number) {
		PreparedStatement preparedStmt = null;
		Connection conn = null;
		try {
			conn = getConnection();
			preparedStmt = conn
					.prepareStatement("delete from PhoneBook where num=?");

			preparedStmt.setString(1, number);
			preparedStmt.executeUpdate();
			conn.commit();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			if(conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		} finally {

			if (preparedStmt != null) {
				try {
					preparedStmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return false;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

}
