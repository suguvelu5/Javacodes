package General_Java_Programs;

public class Swap_number_without_temp {

	public static void main(String[] args) {


		int a=10; int b=20;
		
		System.out.println(a+" : " +b);
		
		a = a+b;
		
		b = a - b;
		
		a = a - b;
		
		System.out.println(a+" : " +b);
		
		
		

	}

}
