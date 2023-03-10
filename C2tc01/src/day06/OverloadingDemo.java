package day06;

public class OverloadingDemo {

	public void m1(int a, String b)
	{
		System.out.println("firstprogram");
	}
	public void m1(String r, int s)
	{
		System.out.println("second program");
	}
	public static void main(String[] args) {
	
		OverloadingDemo obj=new OverloadingDemo();
		obj.m1(12,  "impana");
		obj.m1("imps", 12);

	}

}
