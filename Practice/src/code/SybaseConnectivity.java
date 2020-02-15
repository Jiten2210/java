package code;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SybaseConnectivity {

	public static void main(String[] args) throws SQLException {

		String dburl = "jdbc:jtds:sybase://P3IND0024:5000/pubs2";

		Connection con = DriverManager.getConnection(dburl, "sa", "secret");
		Statement statement = con.createStatement();
		ResultSet rs = null;
		DatabaseMetaData meta = con.getMetaData();
		rs = meta.getProcedures("pubs2", "dbo", "%");
		System.out.println("\n =======SP & Views=======");
		List<String> views = new ArrayList<String>();
		List<String> sp = new ArrayList<String>();
		while (rs.next()) {
			sp.add(rs.getString("PROCEDURE_NAME"));

		}
		rs = meta.getTables("pubs2", "dbo", "%", new String[] { "VIEW" });

		while (rs.next()) {
			views.add(rs.getString("TABLE_NAME"));
		}
		//ResultSet r = null;
		//for (String spview : sp) {
			// String sql1 = "select proc_defn from SYS.SYSPROCEDURE where
			// proc_name="+s+""
			// String sql = "select text from syscomments c, sysobjects o where
			// o.id=c.id and o.name='"+s+"'";
			//String sql = "select text from syscomments c, sysobjects o where o.id=c.id and o.name='" + spview + "'";
			
		StringBuffer sbSP = new StringBuffer();

		String sql ="select text from syscomments c, sysobjects o where o.id=c.id and o.name='history_proc'";
			System.out.println(" init " + sql);

			// try {
			//rs = statement.executeQuery(sql);
			// System.out.println(r );
		/*    String query = "select c.text "
		                  +"from syscomments c, sysobjects o "
		                    +"where o.id=c.id and o.name='"+spName+"' order by c.colid";
*/
		    PreparedStatement stmt = con.prepareStatement(sql);
		    ResultSet rs1 = stmt.executeQuery();

		    while (rs1.next()) {
		        //loop over every row of the stored procedure
		        sbSP.append(rs1.getString("text") + "\n");
		        System.out.println(sbSP);
		    }
			
			
			
			
/*
			while (rs.next()) {

				String s = rs.getString(1);
				System.out.println("Query " + s );
				if (s == null)
					continue;
				int begin = 0;
				int beginAs = s.indexOf("as");
				String input = s.substring(beginAs + 2);
				input = input.replace('(', ' ');
				input = input.replace(')', ' ');
				System.out.println("sybase " + input);

			}
*/
		//}
	}
}
