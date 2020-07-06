package Constor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.stream.IntStream;

public class sss {

	public static void main(String[] args) {

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
		Date date = new Date();
		String date1= dateFormat.format(date);
		System.out.println(date1);

		/*String s="yuvaraj";
		String s1="yuvaraj";

		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));


		String n= new String("yuvaraj");
		String n1= new String("yuvaraj");
		System.out.println(System.identityHashCode(n));
		System.out.println(System.identityHashCode(n1));*/

	}



}
/*public static void main(String args[]) 
	{     


		String s="my name is yuvaraj";
		String[] ff = s.split(" ");
		System.out.println(ff[1]);
		String d="yuvaraJ";
		if(d.contains("yuv"))
		{
		System.out.println("sdfsdfsdfdsfsd");	
		}


		if(s.equalsIgnoreCase(d))
		{
			System.out.println(s +" is equals to " + d);
		}
		else
		{
			System.out.println("sdfhgj");
		}
		int i = s.indexOf('j');
		System.out.println(i);

		char cc = s.charAt(2);
		System.out.println(cc);


		String u = s.toUpperCase();
		System.out.println(u);


		int kk = s.indexOf('a', 4);
		System.out.println(kk);

		int l = s.indexOf("v");
		System.out.println(l);




	}
}*/
