package mypack;
import java.util.Arrays;

public class Ispalin {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int arr[]= {1,2,2,33,4774,343,6712,787};
			pallindrome(arr);

		}
		 static boolean isPallindrome(String s)
		 {
			 StringBuilder sb= new StringBuilder(s);
			 sb.reverse();
			 String s1=sb.toString();
			 return s1.equals(s);
		 }
		 static void pallindrome(int arr[])
		 {
			 for(int i=0;i<arr.length;i++)
			 {
				 
				 if(isPallindrome(arr[i]+""))
				 {
					 System.out.print(arr[i]+" ");
				 }
			 }
		 }
}
