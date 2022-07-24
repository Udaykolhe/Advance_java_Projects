package DatabaseConfig;
import java.sql.*;
public  class  Db {
	private static Connection con;
	private static Statement  sts;
	private static ResultSet rs;
	
	public Db()
	{
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","Kazahks@5");
		    sts=con.createStatement();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
		
		 
	
	 public Connection getCon() {
		 return con;
			
	}
	 public Statement getSts() {
		 return sts;
	 }
}
