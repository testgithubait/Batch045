package day06;

public class Execute extends OverridingDemo {
	public void m1(String q, int s)
	{
		System.out.println("second prgm");
	}

	public static void main(String[] args) {
		Execute obj=new Execute();
		obj.m1("imps", 27);

	}

}
