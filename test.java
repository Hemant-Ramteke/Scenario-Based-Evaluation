package tourpackages;
import java.sql.*;
public class test 
{
	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/entries";
		String user="root";
		String password="rps@12345";
		String query= "select * from tour_package";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection(url,user,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			String pid=rs.getString("package_id");
			String sp=rs.getString("source_place");
			int bf=rs.getInt("basic_fare");
			String dp=rs.getString("destin_place");
			System.out.println(pid+" "+sp+" "+bf+" "+dp+'\n');
		}
		st.close();
		con.close();
		// TODO Auto-generated method stub
	}
}
