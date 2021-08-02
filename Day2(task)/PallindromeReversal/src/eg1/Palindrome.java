package eg1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String s =sc.nextLine();
		String[] s1 = s.split(" ");
		String f ="";
		for(String x : s1) {
			f=f+isPallindrome(x)+" ";
	    }
		System.out.println(f);

	}
	static String isPallindrome(String s)
	{
		if(isPalindrome(s))
		{
			return s;
		}
		else
		{
			StringBuilder sb=new StringBuilder(s);
			sb.reverse();
			return sb.toString();
		}
	}
	public static boolean isPalindrome(String s) {
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String s1=sb.toString();
		return s.equals(s1);
	}
		

	}


