package exercise.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	
	private static final String JDBC_POSTGRESQL_HOST = "jdbc:postgresql://localhost:5432/";

	private static final String DB_NAME = "java-db";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "root";
	private DBUtils() {
	}
	
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(JDBC_POSTGRESQL_HOST + DB_NAME, USERNAME, PASSWORD);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}