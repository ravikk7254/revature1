package pack;


	public class AreaS{
		public static int Area(int a) {
			return a*a;
		}
	
	//class AreaR extends AreaS{
		public static int Area(int a,int b ) {
			return a*b;
		}
	
	//class AreaT extends AreaR{
		public static double Area(int a,int b,int c) {
			return (double)((a+b)*c)/2;
		}
		public static void main(String[] args) {
			//AreaT t= new AreaT();
			System.out.println(Area(2));
			System.out.println(Area(2,3));
			System.out.println(Area(2,5,8));

	}
	}
