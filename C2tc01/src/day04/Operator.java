package day04;

public class Operator {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int x=10;
		System.out.println("The value of a and b before operation is : " + a + " and " + b);
		++a;
		int c=++a + b + a--;
		System.out.println("c value after the operation is : " + c);
		int d=c++ +a + b--;
		System.out.println("d value after operation : " + d);
		System.out.println("the value of a and b after operation is : " + a+ " and " + b);
		
		x=(10==x)? 1:0;
		System.out.println(x);
	}

}
