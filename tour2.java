package tourpackages;

public class tour2 
{
	private String package_id;
	private String source_place;

	private String destin_place;
	private double basic_fare;

	public tour2(String package_id, String source_place, String destin_place, double basic_fare) 
	{
		super();
		this.package_id= package_id;
		this.source_place= source_place;
		this.destin_place= destin_place;
		this.basic_fare= basic_fare;
	
	}
		public String getPackage_id() 
		{
			return package_id;
		}
		public void setPackage_id(String package_id) 
		{
			this.package_id=package_id;
		}
		public String getSource_place() 
		{
			return source_place;
		}
		public void setSource_place(String source_place) 
		{
			this.source_place=source_place;
		}
		public String getDestin_place() 
		{
			return destin_place;
		}
		public void setDestin_place(String destin_place) 
		{
			this.destin_place=destin_place;
		}
		public double getBasic_fare() 
		{
			return basic_fare;
		}
		public void setBasic_fare(double basic_fare) 
		{
			this.basic_fare=basic_fare;
		}
		public String toString() 
		{
			return "tour2 [Package_id=" +package_id+ ",Source_place=" +source_place+ ", Destination_Place=" +destin_place+ ", basic_fare=" +basic_fare+ "]";
		}
}
