/* Write a program that take 5 employee name and their salary. Find highest salary and display those employee name. */
import java.io.*;

class EmpAry
{
	public static void main(String args[])throws Exception
	{
		String empnm[]=new String[5];
		int sal[]=new int[5];
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter employee name and salary");
		for(int i=0;i<5;i++)
		{
			empnm[i]=d.readLine();
			sal[i]=Integer.parseInt(d.readLine());
		}
		int temp=0;
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(sal[i]>sal[j])
				{
					temp=sal[i];
					sal[i]=sal[j];
					sal[j]=temp;
				}
			}
		}
		System.out.println("Highest Salary is:"+sal[4]);

	}

}
