package day01;

public class TypeCasting {

	public static void main(String[] args) {
		//implicit type casting
				byte b=10;
				int i=b;
				System.out.println(i);
				
				float f=22.14f;
				double d=f;
				System.out.println(d);

				char ch='A';
				int i1=ch;
				System.out.println(i1);
				
				char var1='\u00A7';
				int i2=var1;
				System.out.println(i2);
				
				//explicit type casting 
				double d1=10.52f;
				long l=(long)d1;
				System.out.println(l);
				
				long l1=896667012356789l;
				int i3=(int)l1;
				System.out.println(i3);
				
				float f4=34.5f;
				int i4=(int)f4;
				System.out.println(i4);

	}

}
