/* Write a java program that takes 2 numbers from user in main method. Create a check() method and check for even or odd number for the given input by user in check method. */
import java.io.*;
class demoArg2
{
	public void check(int x,int y)
	{
		if(x%2==0)
		{
			System.out.println(x+" is even numer");
		}
		else
		{
			System.out.println(x+" is odd number");
		}
		if(y%2==0)
		{
			System.out.println(y+" is even numer");
		}
		else
		{
			System.out.println(y+" is odd number");
		}			

	}
	public static void main(String args[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter first Number");
		int n1=Integer.parseInt(d.readLine());
		System.out.println("Enter second Number");
		int n2=Integer.parseInt(d.readLine());

		demoArg2 d1=new demoArg2();
		d1.check(n1,n2);
				

	}


}