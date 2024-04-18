package demo;
//without returntype and within parameters

public class MethodSyntax3 {
	public void sum(int x,int y)
	{
		int res=x+y;
		System.out.println("the sum of a and b values:"+ res);
		
	}

	public static void main(String[] args) {
		MethodSyntax3 obj=new MethodSyntax3();
		obj.sum(100,200);
		

	}

}
