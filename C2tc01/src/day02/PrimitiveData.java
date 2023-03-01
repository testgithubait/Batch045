package day02;

public class PrimitiveData {

	public static void main(String[] args) {
		byte minbyte=-128;
		byte maxbyte=127;
		System.out.println("minbyte is : " + minbyte + " max byte is : " + maxbyte);

		short minshort=-32768;
	    short maxshort=32767;
	    System.out.println("minshort is : "+ minshort + " maxshort is : "+ maxshort);
	    
	    int minint=-2147483648;
	    int maxint=2147483647;
	    System.out.println("minint is : "+ minint + " max int is : " + maxint);
		
	    long minlong=-9223372036854775808L;
	    long maxlong=9223372036854775807L;
	    System.out.println("minlong is : "+ minlong + " maxlong is : "+ maxlong);
		
	    boolean flag=true;
	    System.out.println("boolean value is : "+ flag);

	}

}
