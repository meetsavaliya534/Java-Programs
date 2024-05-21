/* Write a java program that takes username and surname in main method. Display both in display() method. */

import java.io.*;
class demoArg1
{
	public void display(String n,String s)
	{
		System.out.println("Name is:"+n);
		System.out.println("SurName is:"+s);
	}
	public static void main(String args[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter Your name");
		String nm=d.readLine();
		System.out.println("Enter Your SurName");
		String snm=d.readLine();
		
		demoArg1 d1=new demoArg1();
		d1.display(nm,snm);
		
	}



} 