package day06;

public class Hierarchical {

	public static void main(String[] args) {
		Person p1=new Person();
		System.out.println("......person details...");
		System.out.println(p1);

		Person p;
		p=new Person ("Dhruv", "Mumbai");
		if (p instanceof Person)
			System.out.println("person Deatils "+p);
		
		p= new Employee ("Nikhil", "Mumabi", 101, 67000, "Sales");
		 if (p instanceof Employee)
			 System.out.println("Employee Details"+ p);
		 
		 p= new Students ("Pankaj", "pune", "FE", 88);
		 if (p instanceof Students)
			 System.out.println("Student Details "+p);
		 
	}
	

}
