
/*Write a java program that takes 2 number from user. Pass that number to disp method. In disp method check that number is even or odd. Display odd number in main method and even number in disp method. */ 

import java.io.*;

class demoReturn1
{
	public int disp(int x,int y)
	{
		if(x%2==0)
		{
			System.out.println("Even number is:"+x);
		}
		else if(y%2==0)
		{
			System.out.println("Even number is:"+y);
		}
		else
		{
			System.out.println("Not any number is Even::");
		}
		if(y%2!=0)
		{
			return y;
		}
		else if(x%2!=0)
		{
			return x;
		}
		else
		{
			System.out.println("Not any number is Odd::");
		}
		return 0;
	}
	public static void main(String args[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter 2 numbers");
		int n1=Integer.parseInt(d.readLine());
		int n2=Integer.parseInt(d.readLine());

		demoReturn1 r=new demoReturn1();
		System.out.println("Odd number is:"+r.disp(n1,n2));
	}


}