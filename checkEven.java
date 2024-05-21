/*Write a java program that takes 2 numbers from user. Check for Even or odd number in check() method. */ 
import java.io.*;
class checkEven
{
	public void check(int x,int y)
	{
		if(x%2==0)
		{
			System.out.println(x+" is even");
		}
		else
		{
			System.out.println(x+" is Odd");

		}
		if(y%2==0)
		{
			System.out.println(y+" is even");
		}
		else
		{
			System.out.println(y+" is Odd");

		}

	}
	public static void main(String args[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter first Number");
		int n1=Integer.parseInt(d.readLine());
		System.out.println("Enter second Number");
		int n2=Integer.parseInt(d.readLine());	
		checkEven c=new checkEven();
		c.check(n1,n2);
	}

}