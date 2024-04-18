package demo;
//with returntype and with parameter 

public class MethodSyntax4 {
	public float sum (int a,float b)
	{
	float res=a+b;
	return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodSyntax4 obj=new MethodSyntax4();
	System.out.println(obj.sum(12, 2.23f));

	}

}
