/* Write a java program that takes 1 number from user in main method. Make addition of each digit of that number in calculate() method. Display answer of that addition in main method. 
*/
import java.io.*;
class demo
{
	public int calculate(int x)	
	{
		int x1=0;
		int sum=0;
		while(x!=0)	
		{
			x1=x%10;	
			sum=sum+x1;	
			x=x/10;		
		}
		return sum;
		
	}
	public static void main(String args[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);	
		System.out.println("Enter Number");
		int n1=Integer.parseInt(d.readLine());
		
		demo d1=new demo();
			//calling statement
		System.out.println("Addition is:"+d1.calculate(n1));
		
		
	}
}


