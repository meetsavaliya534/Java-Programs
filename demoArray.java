/* Pass by reference / Call by reference 
 write a java program that takes 5 number in array from user in main method. Pass array in in calc() method. Display addition of each element of an array. */
import java.io.*;
class demoArray
{
	public void calc(int x[])
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		System.out.println("Addition is:"+sum);
	}

	public static void main(String args[])throws Exception
	{
		int ary[]=new int[5];
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter 5 numbers");
		for(int i=0;i<ary.length;i++)
		{
			ary[i]=Integer.parseInt(d.readLine());
		}		
		
		demoArray d1=new demoArray();
	              d1.calc(ary);		//passing address of array. Pass by reference / Call by reference.  
	}
}