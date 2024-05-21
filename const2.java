/* Write a java program that student name and percentage from user. display the student name from one constructor. 
In second constructor check that percentage value is >60 then give message as "First Class" or if it is <60 then give message as "Second result". */ 
import java.io.*;
class const2
{
	public const2(String stnm)
	{
		System.out.println("Student name is:"+stnm);

	}
	public const2(float per)
	{
		if(per>60)
		{
			System.out.println("First Class::");
		}
		else if(per<60)
		{
			System.out.println("Second class");
		}
		else
		{
			System.out.println("Invalid result::");
		}

	}
	public static void main(String args[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter student name");
		String nm=d.readLine();
		System.out.println("Enter student percentage");
		float f=Float.parseFloat(d.readLine());

		const2 c1=new const2(nm);	//Call to first constructor

		const2 c2=new const2(f);	//Call to second constructor	

		
	}


}