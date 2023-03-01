package day04;
import java.util.Scanner;

public class PersonDetails {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the name :");
		String name=ob.next();
		System.out.println("enter the age :");
		int age=ob.nextInt();
		System.out.println("enter the gender :");
		String gender=ob.next();
		System.out.println("enter the income :");
		int income=ob.nextInt();
		
		
		
		
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		
		System.out.println(person);
		
		TaxCalculation calc = new TaxCalculation();
		calc.Calculatetax(person);
		System.out.println("After calculation tax : ");
		System.out.println(person);
		ob.close();
		
	}

}
