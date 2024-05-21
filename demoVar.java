/* Write a java program that takes 2 numbers from user. Initialize that numbers to the global variables. Display that numbers in display method. */ 

class demoVar
{
	int a,b=0;
	demoVar(int a,int b)
	{
		this.a=a;
		this.b=b;
		display();

	}
	public void display()
	{
		System.out.println("Given values are:"+a+"and"+b);
	}	
	public static void main(String args[])
	{
		demoVar d=new demoVar(10,20);
	}
	
		


}