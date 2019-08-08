//Sai Juttu
public class Task {
	
	private String name;
	private int timeRequired;
	private boolean status;
	
	public Task(String name, int timeRequired, boolean status)
	{
		this.name = name;
		this.timeRequired = timeRequired;
		this.status = status;
	}
	public String getName()
	{
		return name;
	}
	public int getTimeRequired()
	{
		return timeRequired;
	}
	public boolean getStatus()
	{
		return status;
	}

}
