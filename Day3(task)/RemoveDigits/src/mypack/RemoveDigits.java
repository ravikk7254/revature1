package mypack;

public class RemoveDigits {
	public static void main(String [] args)
	{
		int arr[]= {1,707,8088,3456,56,343,232,1111};
		for(int i=0;i<arr.length;i++)
		{
			if(isLastAndFirstDigitSame(arr[i])!=true)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	static boolean isLastAndFirstDigitSame(int a)
	{
		boolean b=false;
		String s=a+"";
		if(s.charAt(0)==s.charAt(s.length()-1))
		{
			b=true;
		}
		return b;
	}

}
