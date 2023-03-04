package day05;

public class Base {
	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected=40;
	
	void methodDefault() {
		System.out.println("default access base class");
		System.out.println("default variable " + varDefault);
	}
	public void methodPublic() {
		System.out.println("public access base class ");
		System.out.println("public variable :" + varPublic);
	}
	public void methodPrivate() {
		System.out.println("public access base class");
		System.out.println("private variable : "+ varPrivate);
	}
	public void methodProtected() {
		System.out.println("protected access base class");
		System.out.println("protected variable : " + varProtected);
	}

}
