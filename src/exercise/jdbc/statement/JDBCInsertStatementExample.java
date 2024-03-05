package exercise.jdbc.statement;

import java.sql.SQLException;
import java.sql.Statement;

import exercise.jdbc.DBUtils;  // Assuming this class provides connection

public class JDBCInsertStatementExample {

	public static void main(String[] args) throws SQLException {
		String query = "INSERT INTO user_data (id,first_name, last_name, email) VALUES (1,'Dmytriy', 'Voloshov', 'd.voloshov@email.com')";
		try (var conn = DBUtils.getConnection();
				Statement statement = conn.createStatement()) {
			int rows = statement.executeUpdate(query);
			System.out.println(rows);
			
		}
	}

}
