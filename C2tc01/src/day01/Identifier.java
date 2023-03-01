package day01;

public class Identifier {

	public static void main(String[] args) {
        int fr=13; //keywords cannot be use
		
		int num_2=20; // should not include space
		
		int $num=39; //it can starts with $
		
		int num=90; //special symboles are not allowed
		
		System.out.println("the value is : " + $num);
		String sname="anup";
		System.out.println(sname);
		System.out.println(fr);
		System.out.println(num_2);
		System.out.println(num);

	}

}
