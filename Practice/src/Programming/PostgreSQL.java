package Programming;
/**
 * 
 */

/**
 * @author Jitu
 *
 */
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQL {

	@SuppressWarnings("null")
	public static void main(String[] argv) throws SQLException {

		System.out.println("-------- PostgreSQL "
				+ "JDBC Connection Testing ------------");
		Statement st = null;
		ResultSet rs = null;
		ResultSet rs1 = null;

		try {

			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
			return;

		}

		System.out.println("PostgreSQL JDBC Driver Registered!");

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/postgres", "postgres",
					"secret");

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;

		}

		DatabaseMetaData meta =connection.getMetaData();

			//rs = meta.getProcedures("sakila","sakila", "%");
			rs = meta.getProcedures("postgres","testing", "%");

			System.out.println("\n =======SP & Views=======");
			while (rs.next()) {
				System.out.println("Procedure  " + rs.getString("PROCEDURE_NAME"));
				
			}
			

			rs1 = meta.getTables("postgres","testing", "%", new String[] { "VIEW" });

			while (rs1.next()) {
				System.out.println("Views  " +rs1.getString("TABLE_NAME"));
			}

System.out.println("You made it, take control your database now!");
	

}
}
	
