package pckg1.launchbrowser;

public class Pyramid {

	public void star() {

	for (int i = 1; i <= 3; i++)  //1<=3    2<=3    3<=3  4<=3
	{
		for (int j = i; j <= 3; j++) { //j=2;2<=3;*
			System.out.print("*");

		}
		System.out.println();
	}
	}


	/*public void arrayyyy() {

		int a[]= {4,5};
		System.out.println(a[0]);
		System.out.println(a[1]);
		try {
			System.out.println(a[2]);
		}
		catch(Exception e)
		{
			System.out.println(a[1]);		}
	}*/

	public static void main(String[] args) {

		Pyramid p = new Pyramid();
		p.star();


	}

}
