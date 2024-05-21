/* Write a program that take 5 student name and display that names. */
import java.io.*;
class StringArray
{
	public static void main(String args[])throws Exception
	{
		String nm[]=new String[5];
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter 5 student names::");
		for(int i=0;i<5;i++)
		{
			nm[i]=d.readLine();

		}
		System.out.println("Student names are::");
		for(int i=0;i<5;i++)
		{
			System.out.println(nm[i]);
		}

	}
}