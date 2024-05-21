/* Write a program that take numbers from user, store in array. Take size of array from user. And display Multiplication of all numbers. */

import java.io.*;
class ArrayDynamic
{
	public static void main(String args[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter size of Array");
		int size = Integer.parseInt(d.readLine());
		int mul=1;
		int ary[]=new int[size];
		System.out.println("Enter numbers in array::");
		for(int i=0;i<ary.length;i++)
		{
			ary[i]=Integer.parseInt(d.readLine());
			mul=mul*ary[i];	
			System.out.println("Multiplication Answer::"+mul);
		}

	}
}