package code;
import java.sql.*;

class MysqlCon {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con;
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sandeep", "root", "jitu1234");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from sandy");
				while (rs.next())
					System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
				con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// here sonoo is database name, root is username and password
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}