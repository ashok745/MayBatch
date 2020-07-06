package Constor;

public class Empdtl {
	

	public Empdtl() {
		this(10);
		System.out.println("parent class default constructor");
	}
	public Empdtl(int a) {
		this("yuvraj");
		System.out.println("parameterized constructor for int "+a);
	}	
	
	public Empdtl(String s) {

		System.out.println("parameterized constructor for string " +s);
		System.out.println("parameterized constructor for string " +s);

	}	
		
	
	public static void main(String[] args) {
		
		Empdtl ldl=new Empdtl();
		Empdtl ll=new Empdtl(50);
		Empdtl lll=new Empdtl("kk");

	}

}
