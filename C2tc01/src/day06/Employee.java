package day06;

public class Employee extends Person{

	private int empID;
	private float salary;
	private String dept;
	public Employee() {
		System.out.println("default class");
	}
	public Employee(int empID, float salary, String dept)
	{
		this.empID=empID;
		this.salary=salary;
		this.dept=dept;
	}
	public Employee(String name, String city,int empID, float salary, String dept) {
		super(name,city);
		this.empID = empID;
		this.salary = salary;
		this.dept = dept;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
    
	public String toString () {
		return "Employee [ empId=" + empID + " , salary=" + salary + " , dept="+ dept + " , getName()=" + getName()+ 
				" , getCity()=" + getCity()+ "]";
}
}
