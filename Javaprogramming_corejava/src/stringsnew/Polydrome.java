package stringsnew;

public class Polydrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Dad";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) 
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println(rev +"is a polydrome");
		}
		else
		{
			System.out.println(rev +" is a not polydrome");
		}
				

	}

}
