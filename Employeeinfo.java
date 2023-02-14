package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Employeeinfo {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number of employee");
	int num=sc.nextInt();
	Employee anusha= new Employee("Anusha",16,"anuskasthacr7@gmail.com",30000);
	Employee bikash = new Employee("Bikash",17,"bikasshah1921@gmail.com",30030);
	Employee sita= new Employee("Sitara",18," sitashrestha@gmail.com",11111);
	
	List<Employee> employeeList= new ArrayList<>();
	employeeList.add(anusha);
	employeeList.add(bikash);
	employeeList.add(sita);
	
	Iterator iterator = employeeList.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}

	System.out.println("--------------------Information of Employee-----------------------");
	System.out.println("Name \t \tId \t \t Email\t\t\t NetSalary");
	for(Employee employee:employeeList )
	{
		double netSalary;
		if(employee.getSalary()>20000)
		{
			netSalary=0.5*employee.getSalary();
			System.out.println(" "+employee.getName()+" \t"+employee.getId()+"\t"+employee.getEmail()+"\t\t"+netSalary);
		}
		else
			System.out.println(" "+employee.getName()+" \t"+employee.getId()+"\t"+employee.getEmail()+"\t\t"+employee.getSalary());
	
		
	}
	
}




}
