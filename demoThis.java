/* Write a java program that take 2 numbers from user. First constructor which check that the given number is even or odd. from the first constructor call second constructor which check for even odd for second number. Take values from user in main method. */
import java.io.*;
class demoThis
{
	public demoThis(int a,int b)
	{
		this(b);
		if(a%2==0)
		{
			System.out.println(a+" is even");
		}
		else
		{
			System.out.println(a+" is odd");
		}
	}
	public demoThis(int b)
	{
		if(b%2==0)
		{
			System.out.println(b+" is even");
		}
		else
		{
			System.out.println(b+" is odd");
		}		
	}
	public static void main(String args[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter 2 numbers");
		int n1=Integer.parseInt(d.readLine());
		int n2=Integer.parseInt(d.readLine());

		demoThis d1=new demoThis(n1,n2);
	}
	



	


}