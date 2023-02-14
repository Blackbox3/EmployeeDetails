package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Studentinfo {
public static void main(String[] args) {
	Student anusha=new Student("Anusha","Kupondole","9814301921",80777);
	Student bikash= new Student("Bikash","Pulchowk","9862290342",6767);
	Student ojha= new Student ("Ojha","Biratnagar","9347927592",7678);
	
	List<Student> studentList= new ArrayList<>();
			
		studentList.add(anusha);
		studentList.add(bikash);
		studentList.add(ojha);
			
		Iterator iteration= studentList.iterator();
		while(iteration.hasNext())
		{
			System.out.println(iteration.next());
		}
			for(Student student:studentList)
			{
				if( student.getFee()>5000)
				{
					System.out.println("Name of Student "+ student.getName());
				}
			}
		
}
}
