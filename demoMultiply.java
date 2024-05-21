/* Write a java program that takes 2 numbers from user in main method. Make multiplication of that numbers in multiply method. In main method add 10 in answer of multiplication and display the final answer. */ 

import java.io.*;

class demoMultiply
{
	public int multiply(int x,int y)
	{
		int ans=x*y;
		return ans; 
	}
	public static void main(String args[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter 2 numbers::");
		int n1=Integer.parseInt(d.readLine());
		int n2=Integer.parseInt(d.readLine());

		demoMultiply d1=new demoMultiply();	//object create
		int f = 10 + d1.multiply(n1,n2);		// method calling

		System.out.println("final answer is:"+f);
	}



}