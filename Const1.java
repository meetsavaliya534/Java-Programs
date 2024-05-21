/* Write a java rpogram that User name and surname from user. Display the given values in constructor. */

import java.io.*;
class const1
{
	public const1(String unm,String snm)
	{
		System.out.println("Name is:"+unm);
		System.out.println("Surname is:"+snm);
	}
	public static void main(String args[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter User name");
		String nm=d.readLine();
		System.out.println("Enter User Surname");
		String snm=d.readLine();
		const1 c=new const1(nm,snm);
	}
}