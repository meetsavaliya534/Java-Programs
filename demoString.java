/* Write a java program that take name and surname from user. Display the name id display method. and display the surname with "Hello" message in main method. Must use return statement. */ 

import java.io.*;
class demoString
{
	public String display(String n,String s)
	{
		System.out.println("Your name is:"+n);
		return s;

	}
	public static void main(String args[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter your name");	
		String nm=d.readLine();
		System.out.println("Enter your surname");
		String snm=d.readLine();
		
		demoString d1=new demoString();
		System.out.println("Hello"+d1.display(nm,snm));

	}

}