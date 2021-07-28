package problem4;

import java.util.Scanner;

public class Hypotenuse {
	public static int findHypotenuse(int a ,int b) {
		int c=((a*a)+(b*b));
		return c;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=Integer.parseInt(sc.nextLine());
		System.out.println("enter the value of b");
		int b=Integer.parseInt(sc.nextLine());
		System.out.println("Hypotenuse:"+findHypotenuse( a, b));
		
		
	}

}
