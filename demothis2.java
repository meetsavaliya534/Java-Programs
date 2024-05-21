/* Write a java program that have 2 constructors. 1 is default and second with username. Take username from user. Use this keyword to call constructor. And only create one object of the class. */ 

import java.io.*;
class demothis2
{
	public demothis2()
	{
		System.out.println("Default Constructor:::");
	}
	public demothis2(String unm)
	{
		this();
		System.out.println("User name is:"+unm);
	}
	public static void main(String args[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter Your Name:");
		String nm=d.readLine();
		demothis2 d1=new demothis2(nm);	//calling statement for constructor
	}
}