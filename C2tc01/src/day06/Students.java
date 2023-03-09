package day06;

public class Students  extends Person{

	private String clas;
	private float per;
	public Students()
	{
		System.out.println();
		clas="fy";
		per=70;
	}
	public Students(String clas, float per)
	{
		this.clas=clas;
		this.per=per;
		
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	
	public Students(String name, String city, String clas, float per)
	
	{
		super(name,city);
		this.clas=clas;
		this.per=per;
	}
	
	public String toString() {
		return "Student [ clas=" + clas + " , per = " + per + " , getName() = " + getName() + ", getCity() = " + getCity() + "]";
	}
	
	
}
