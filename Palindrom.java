/* Write a java program that take one number from user. Pass that number in disp method. Check that number is palindrom or not. 
x=151	x%10 	1   5  1  
*/

import java.io.*;

class Palindrom
{
	public void disp(int x)
	{
		int temp=0;
		int sum=0;
		int r=0;
		temp=x;
		while(x>0)
		{
			r=x%10; 		//1 5 1
			sum=(sum*10)+r;	 // 1*10+5 = 151
			x=x/10;		//15	
		}
		if(temp==sum)
		{
			System.out.println(temp+" is palindrom number::");
		}			
		else
		{
			System.out.println(temp+" is not palindrom number::");		
		}
	}
	public static void main(String args[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter a number");
		int n1=Integer.parseInt(d.readLine());

		Palindrom p=new Palindrom();
		p.disp(n1);

	}


}