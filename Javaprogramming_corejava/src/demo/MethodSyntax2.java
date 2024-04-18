package demo;
 //with the returntype programming and without parameters

public class MethodSyntax2 {

	static int a=10;
	static int b=20;
	static int res;
	public static int sum()//static method 
	{
		res=a+b;
		
		return res;
	}
	

	public static void main(String[] args) {
		
		int total=MethodSyntax2.sum();
		
		System.out.println("the sum of a and b values are:"+res);
		

	}

}