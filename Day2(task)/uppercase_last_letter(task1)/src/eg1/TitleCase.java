package eg1;

public class TitleCase {

	public static void main(String[] args) {

String s="hello i am ravi kumar";
System.out.println(convertToTitleCase(s));

	}
	public static String convertToTitleCase(String s) {
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int i =0; i < ar.length; i++) {
			sb.append(ar[i].substring(0,ar[i].length()-1)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(" ");
		}
		return sb.toString().trim();
	}

}
