package exercise.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionExample {
	private static final String POSTGRESQL_JDBC_DRIVER_NAME = "org.postgresql.Driver";

	
	private static final String JDBC_POSTGRESQL_HOST = "jdbc:postgresql://localhost:5432/";

	private static final String DB_NAME = "java-db";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "root";

	public static void main(String[] argv) {

		System.out.println("-------- PostgreSQL JDBC Connection Testing ------------");

		try {
			Class.forName(POSTGRESQL_JDBC_DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			System.out.println("Can't find JDBC driver. Please, make sure JDBC driver is added to a classpath.");
			return;
		}

		try (Connection connection = DriverManager.getConnection(JDBC_POSTGRESQL_HOST + DB_NAME, USERNAME, PASSWORD);) {

			if (connection != null) {
				System.out.println("You made it, take control your database now!");
			} else {
				System.out.println("Failed to make connection!");
			}

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}

	}
}
