/* Write a java program that have 2 constructors. First constructor will display UserName, Second constructor will display MobileNumber which must be of 10 digits. Take all values from user in main method. */

import java.io.*;
class demoConst
{
	public demoConst(String unm)
	{
		System.out.println("Username is:"+unm);
	}
	public demoConst(long n1)
	{
		long count=0;
		long temp=n1;
		while(n1!=0)
		{
			n1=n1/10;
			count++;
		}
		if(count==10)
		{
			System.out.println("Valid Mobile Number: "+temp);
		}
		else
		{
			System.out.println("Plz enter 10 digit mobile number");
		}
	}
	public static void main(String args[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter your name");
		String nm=d.readLine();
		System.out.println("Enter your mobile number");
		long x=Long.parseLong(d.readLine());
		
		demoConst d1=new demoConst(nm);
		demoConst d2=new demoConst(x);
			
	}
}

