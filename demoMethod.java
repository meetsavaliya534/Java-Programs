/* Write a java program that have 2 constructors, One is default, Second is with 2 numbers. Create a display() method that will display the addition of numbers given by user. Take input from user. */
import java.io.*;
class demoMethod
{
	int a,b=0;			//global variables	
	public demoMethod()
	{
		System.out.println("Default constructor::");
	}
	public demoMethod(int x,int y)
	{
		this();
		a=x;
		b=y;
		display();	
	}
	public void display()
	{
		System.out.println("Addition is:"+(a+b));
	}
	public static void main(String args[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter 2 numbers");
		int n1=Integer.parseInt(d.readLine());
		int n2=Integer.parseInt(d.readLine());

		demoMethod d1=new demoMethod(n1,n2);		
	}
}

