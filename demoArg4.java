/* Write a java program that takes 2 numbers from user in main method. Find maximum number in max method. */ 
import java.io.*;
class demoArg4
{
	public void max(int x,int y)
	{
		if(x>y)
		{
			System.out.println("Max Number is:"+x);
		}
		else
		{
			System.out.println("Max number is:"+y);
		}

	}
	public static void main(String args[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter first Number");
		int n1=Integer.parseInt(d.readLine());
		System.out.println("Enter second Number");
		int n2=Integer.parseInt(d.readLine());

		demoArg4 a=new demoArg4();
		a.max(n1,n2);

	}




}