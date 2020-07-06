package Constor;

public class Strbuff {
	
	public static void main(String[] args) {
		
		StringBuilder s =new StringBuilder("selenium");
		StringBuilder s9 =new StringBuilder("selenium");

		System.out.println(s);
		System.out.println(System.identityHashCode(s));

		s.append(s9);		
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		
		
		String s1="selenium";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));

		s1=s1+" java";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));

		
		//System.out.println(System.identityHashCode(r));
		//System.out.println(System.identityHashCode(s1));
	}

}
