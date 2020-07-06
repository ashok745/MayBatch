package Constor;

public class EmpNames extends Empdtl{


	public EmpNames() {
		super("mani");

		System.out.println("child class def constructor");
	}
	
	public EmpNames(String name) {

		System.out.println("par constructor one string");

	}
	
	public EmpNames(String fname, String lname) {
		//super(10);

		System.out.println("par constrcutor two string");
	}
	
	public static void main(String[] args) {
		EmpNames  obj1 = new EmpNames("s","f");
		

	}
}
