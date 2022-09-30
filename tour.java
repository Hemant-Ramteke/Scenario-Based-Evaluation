package tourpackages;
import java.io.*;
public class tour
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		System.out.print("Tour Management"+'\n');
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		while(true) 
		{
			System.out.println("Press 1 to insert data");
			System.out.println("Press 2 to display data");
			System.out.println("Press 3 to get cost");
			System.out.println("Press 4 to exit");
			int c=Integer.parseInt(br.readLine());
			outer2:
			if(c==1) 
			{
				System.out.println("Enter package ID");
				String pid=br.readLine();
				if(pid.length()!=7)
				{
					System.out.println("Its is a wrong id"+'\n');
					break outer2;
				}
				System.out.println("Enter source place");
				String sp=br.readLine();
				if(sp.isEmpty() || sp.isBlank())
				{
					System.out.print("All details to be filled"+'\n');
					break outer2;
				}
				System.out.println("Enter destination place");
				String dp=br.readLine();
				if(dp.isEmpty() || dp.isBlank())
				{
					System.out.print("All details to be filled"+'\n');
					break outer2;
				}
				System.out.println("Enter basic fare");
				double fare=Double.parseDouble(br.readLine());
			
				tour2 t2=new tour2(pid,sp,dp,fare);
				boolean ans= dis.insert(t2);
				if(ans) 
				{
					System.out.println("Added to the menu");
				}
				else
				{
					System.out.println("Sorry..TRY AGAIN");
				}
			}
			else if (c==2)
			{
				dis.show();
			}
			else if (c==3)
			{
				System.out.print("Enter Source Place");
				String c1=br.readLine();
				System.out.print("Enter Destination Place");
				String c2=br.readLine();
				logic lg=new logic(c1,c2);
				dis.cost(lg);
			}
			else if (c==4)
			{
				break;
			}
			else
			{
				System.out.println("THANKYOU");
			}
		}
	}
}
		// TODO Auto-generated method stub



