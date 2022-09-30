package tourpackages;

public class logic 
{
	private String source;
	private String destin;

	public logic(String source, String destin)
	{
		super();
		this.source=source;
		this.destin=destin;
	}
	public String getSource()
	{
		return source;
	}
	public String getDestin() 
	{
		return destin;
	}
	public void setDestin(String destin) 
	{
		this.destin=destin;
	}

public String toString()
{
	return "logic[source="+source+", destin=" +destin+ "]";
}
}
