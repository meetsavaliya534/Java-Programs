/* Write a java program that takes 2 student rollno, name and mobileno from user. display the given values in display method. initialize the global variables for the given values. variable name and argument name are same. display method does not have any arguments. */ 

import java.io.*;
class StudentData
{
	int rollno=0;
	String name=null;
	String mobile=null;
	StudentData(int rollno,String name,String mobile)
	{
		this.rollno = rollno;
		this.name = name;
		this.mobile = mobile;
	}
	public void display()
	{
		System.out.println(rollno+" "+name+" "+mobile);
	}
	public static void main(String args[])throws Exception
	{
		StudentData s1=new StudentData(r1,nm1,mob1);
		s1.display();
		StudentData s2=new StudentData(r2,nm2,mob2);
		s2.display();
	}
}
