package week1.day2;

public class Calculator {
	public void add() {
	int a=111,b=222,c=333,Sum;
	Sum=a+b+c;
	System.out.println("Print the sum=" +Sum);
}
	
public void sub() {
	int a=333,b=111,Sub;
	Sub=a-b;
	System.out.println("Print the Difference=" +Sub);
}

public void mul() {
	double a=333,b=111,mul;
	mul=a*b;
	System.out.println("Print the Product=" +mul);
}
public void div() {
	float a=333,b=111,div;
	div=a/b;
	System.out.println("Print the Division=" +div);
}
public static void main(String[] args) 
{
		Calculator call=new Calculator();
		call.add();
		Calculator obj=new Calculator();
		obj.sub();
		Calculator obj1=new Calculator();
		obj1.mul();
		Calculator obj2=new Calculator();
		obj2.div();
}
}
