package tourpackages;
import java.io.*;
import java.sql.*;
import java.sql.PreparedStatement;
public class dis 
{
	public static boolean insert(tour2 t2) 
	{
		boolean f=false;
		try
		{
		Connection con=connect.createC();
		String q= "insert into tour_package(package_id,source_place,destin_place,basic_fare) values(?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(q);
		pstmt.setString(1, t2.getPackage_id());
		pstmt.setString(2, t2.getSource_place());
		pstmt.setString(3, t2.getDestin_place());
		pstmt.setDouble(4, t2.getBasic_fare());
		pstmt.executeUpdate();
		f=true;
		}
	catch (Exception e)
	{
		e.printStackTrace();
	}
	return f;
}
public static void show()
{
	try 
	{
		Connection con= connect.createC();
		String q1= "select * from tour_package";
		Statement smt= con.createStatement();
		ResultSet set= smt.executeQuery(q1);	
		while(set.next())
			{
			String package_id= set.getString(1);
			String source_place= set.getString(2);
			String destin_place= set.getString(3);
			double basic_fare= set.getDouble(4);
			
			System.out.print("Package ID:" +package_id+'\n');
			System.out.print("Source place:" +source_place+'\n');
			System.out.print("Destination Place:" +destin_place+'\n');
			System.out.print("Basic Fare:" +basic_fare+'\n');
			}
			}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}

public static void cost(logic lg)
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	double price;
	double gst, ds, raw;
	try
	{
		System.out.print("Enter no. of days");
		double days=Double.parseDouble(br.readLine());
		Connection con=connect.createC();
		String q3= "Select basic_fare from tour_package where source_place = ? && destin_place=?";
		PreparedStatement pstmt2= con.prepareStatement(q3);
		pstmt2.setString(1,  lg.getSource());
		pstmt2.setString(2,  lg.getDestin());
		ResultSet set2=pstmt2.executeQuery();
		while(set2.next())
		{
			double b1=set2.getDouble(1);
			if(days<5)
			{
				raw=b1*days;
				gst=(raw*0.12);
				price= raw+gst;
				System.out.print("Package Cost is "+price+'\n');
			}
			else if(days>5 &&days<=8)
			{
				raw=b1*days;
				ds= (raw*0.03);
				gst=((raw-ds)*0.12);
				price=((raw-ds)+gst);
				System.out.print("Package Cost is "+price+'\n');
			}
			else if(days>8 &&days<=10)
			{
				raw=b1*days;
				ds= (raw*0.05);
				gst=((raw-ds)*0.12);
				price=((raw-ds)+gst);
				System.out.print("Package Cost is "+price+'\n');
			}
			else if(days>10)
			{
				raw=b1*days;
				ds= (raw*0.07);
				gst=((raw-ds)*0.12);
				price=((raw-ds)+gst);
				System.out.print("Package Cost is "+price+'\n');
			}
			else
			{
				
			}
			
			}
		}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}
	}
