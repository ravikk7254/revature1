package problem2;
import java.util.Scanner;

public class Address {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 String s=in.nextLine();
		 if(s.startsWith("https"))
			 System.out.println("Secured");
		 else
			 System.out.println("Not Secured");
		 
		
	}
	

}

