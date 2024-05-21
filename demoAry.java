/*Write a program that take 5 numbers from user, store in array and display addition of that numbers. */

import java.io.*;
class demoAry
{
	public static void main(String args[])throws Exception
	{
		int a[]=new int[5];
		int sum=0;
		int mul=1;
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter 5 numbers");
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(d.readLine());

		}
		System.out.println("Array Values Are:::");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			sum=sum+a[i];
			mul=mul*a[i];
		}
		System.out.println("Addition is:"+sum);			
		System.out.println("Multiplication is:"+mul);			
	}
}