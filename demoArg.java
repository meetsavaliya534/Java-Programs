/* Write a program that takes 2 numbers from user. Make addition and subtraction in add() and sub() method and display the answers. */
import java.io.*;
class demoArg
{
	public void add(int n1,int n2)
	{
		System.out.println("Addition is:"+(n1+n2));
	}
	public void sub(int x,int y)
	{
		System.out.println("Subtraction is:"+(x-y));
	}
	public static void main(String args[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter first Number");
		int n1=Integer.parseInt(d.readLine());
		System.out.println("Enter second Number");
		int n2=Integer.parseInt(d.readLine());
		
		demoArg d1=new demoArg();
		d1.add(n1,n2);
		d1.sub(n1,n2);

	}	


}