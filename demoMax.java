/* Write a java program that takes 2 numbers from user. Find maximum number in calc() method and display that maximum number in main method. */ 

import java.io.*;
class demoMax
{
	public int calc(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static void main(String args[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter 2 numbers");
		int n1=Integer.parseInt(d.readLine());
		int n2=Integer.parseInt(d.readLine());

		demoMax d1=new demoMax();
		System.out.println("Max Value is:"+d1.calc(n1,n2));		
	}
}


