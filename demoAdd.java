/* Write a java program that have method called Addition, inside that initialize 2 numbers and display addition of that 2 numbers. */

class demoAdd
{
	public void Addition()
	{
		int n1=15;
		int n2=20;

		System.out.println("Addition is:"+(n1+n2));

	}
	public static void main(String args[])
	{
		demoAdd d=new demoAdd();
		d.Addition();
	}
}