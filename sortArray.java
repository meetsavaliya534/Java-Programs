/* Write a program that take 5 numbers from user. Make sorting of numbers in ascending order. */ 

import java.io.*;
class sortArray
{
	public static void main(String args[])throws Exception
	{
		int a[]=new int[5];
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++)
		{
			a[i]=Integer.parseInt(d.readLine());
		}
		int temp=0;
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;					
				}
			}		

		}
		System.out.println("Array Values Are::");	
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);	
		}
		System.out.println("Minimum number is:"+a[0]);
		System.out.println("Maximum number is:"+a[4]);

	}


}