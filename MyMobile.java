package week1.day2;

public class MyMobile 
{
	public void makecall() 
	{
	System.out.println("Make a call");
	} 
	public void sendMsg() 
	{
	System.out.println("Send message");
	} 	
	private void payBills()
	{
		System.out.println("Pay Bill");
	}
	public static void main(String[] args) 
	{
		MyMobile obj=new MyMobile();
		obj.makecall();
		obj.sendMsg();
		obj.payBills();
	}
}

		