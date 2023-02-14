package collectionFramework;

public class Employee {
    public final static String companyName="F1 Soft";
	private String name;
	private int Id;
	private int Salary;
	private String Email;
	private int netSalary;
	public int i,num;

	
	public int getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(int netSalary) {
		this.netSalary = netSalary;
	}
	{
		this.netSalary=netSalary;
	}
	
	public String getName()
	{
		return name;
	}
	public void  setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return Id;
	}
	public void setId(int Id)
	{
		this.Id=Id;
	}
	public int getSalary()
	{
		return Salary;
	}
	public void setSalary(int Salary)
	{
		this.Salary=Salary;
	}
	public String getEmail()
	{
		return Email;
	}
	public void setEmail(String Email)
	{
		this.Email=Email;
	}
	
	Employee()
	{
		
	}
	Employee(String name,int Id, String Email, int Salary)
	{
		for(i=0;i<=num;i++) {
		this.name=name;
		this.Id=Id;
		this.Email=Email;
		this.Salary=Salary;
	}
	}
}
