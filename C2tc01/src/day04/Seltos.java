package day04;

abstract class Mumbai_rules
{
	abstract void speedlimit();
	abstract void helmet();
	abstract void mirror();
	
}



class Seltos extends Mumbai_rules
{
	void mirror()
	{
		System.out.println("two mirror required");
	}
	void helmet()
	{
		System.out.println("helmet is compulsory");
	}
	void speedlimit()
	{
		System.out.println("should not be more than 60kms");
		
	}

	public static void main(String[] args) {
		Seltos obj=new Seltos();
		obj.speedlimit();
		obj.helmet();
		obj.mirror();

	}

}
