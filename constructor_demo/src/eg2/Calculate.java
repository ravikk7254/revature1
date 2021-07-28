package eg2;

import eg2.Calculate;

public class Calculate {
	private int x;
	private int y;
	
	public Calculate(String name) {
		System.out.println("Hello Calculator(String) name is "+name);
	}
	
	public Calculate(int x,int y) {
		this.x=x;  //Variable shadowing
		this.y=y;
		
	}
	
	public int add() {
		return x+y;
	}
	
	public int sub() {
		return x-y;
	}
	
	public int multiply() {
		return x*y;
	}
public static void main(String[] args) {
		
		Calculate c=new Calculate("JAVA");
		
		System.out.println("add = "+c.add());
		
		c=new Calculate(10, 22);
		System.out.println("add = "+c.add());
		System.out.println("sub = "+c.sub());
		System.out.println("multiply = "+c.multiply());
	}
}



