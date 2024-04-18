package demo;

public class ReverseString {

	public static void main(String[] args) {
		String str="Dad";
		String rev=" ";
		System.out.println(str.length());
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+(str.charAt(i));
		}
		if(rev.equalsIgnoreCase(str));
		{
			System.out.println(rev + "is a ployndrome");
		}
		
		else
		{
		System.out.println(rev +" is a not polyndrome");
		}
	}
}

		
		

	


	
