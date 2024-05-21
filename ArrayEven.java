/*Write a program that takes 5 numbers from user, store in array. Check for each number is it even or odd number.*/ 

import java.io.*;
class ArrayEven
{
	public static void main(String args[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		int a[]=new int[5];
		System.out.println("Enter 5 numbers");
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(d.readLine());
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" Even number:");
			}
			else
			{
				System.out.println(a[i]+" Odd Number::");
			}
		}
	}


}
