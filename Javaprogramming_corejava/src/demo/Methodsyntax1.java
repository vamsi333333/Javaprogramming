package demo;
//the two values a and b addition

public class Methodsyntax1 {
	public void sum() {
		int a=10;
		int b=200;
		
		int res=a+b;
		
		System.out.println("the sum a and b values:"+ res);
		
	}

	public static void main(String[] args) {
		Methodsyntax1 obj=new Methodsyntax1();
		obj.sum();

	}

}
