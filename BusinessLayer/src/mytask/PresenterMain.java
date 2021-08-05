package mytask;

import java.util.Scanner;

public class PresenterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Username (Only alphanumeric");
		String username=sc.nextLine();
		System.out.println("Password (Alphanumeric and special character like@&_.)");
		String password=sc.nextLine();
	    Businessvalidation bv=new Businessvalidation();
        try {
          if(bv.isValidUserName(username))
          {
        	  System.out.println("Valid Username");
          }
        }
        catch(InvalidUserNameException e)
        {
        	System.out.println(e.getMessage());
        }
        try {
            if(bv.isValidPassword(password))
            {
          	  System.out.println("Valid Password");
            }
          }
          catch(InvalidPasswordException e)
          {
          	System.out.println(e.getMessage());
          }
	}

}
