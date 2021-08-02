package eg1;

public class Convert_Case {

	public static void main(String[] args) {
		String s="hello i live in purnea bihar";
		System.out.println(convertToTitleCase(s));
		

	}
	public static String convertToTitleCase(String s)
	{
		String ar[]=s.split(" ");
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<ar.length;i++)
		{
			if((ar[i].length()%2)!=0)
			{
				sb.append(ar[i].substring(0,(0+ar[i].length()-1)/2)).append(Character.toUpperCase(ar[i].charAt ((0+ar[i].length()-1)/2))).append(ar[i].substring((0+(ar[i].length()-1)/2)+1)).append(" ");
			}
			else
			{
				sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
				
			}
		}
		return sb.toString();
	}
	
}
