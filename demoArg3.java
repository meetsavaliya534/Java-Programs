/*Write a java program that take name from user in main method. Display the name with "welcome" message in display method. */

import java.io.*;

class demoArg3
{
	public void display(String n)
	{
		System.out.println("Welcome "+n);
	}
	public static void main(String args[])throws Exception
	{	
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter Your Name");
		String nm=d.readLine();

		demoArg3 d3=new demoArg3();
		d3.display(nm);
	
	}
}