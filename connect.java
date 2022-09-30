package tourpackages;
import java.sql.*;
public class connect
	{
		static Connection con;
		public static Connection createC()
		//driver load
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String user="root";
				String password="rps@12345";
				String url= "jdbc:mysql://localhost:3306/entries";
				con= DriverManager.getConnection(user,password,url);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
	return con;
		}
}
