/* No return No argument Method. 
Write a java program that display your name and surname in disp() method. */ 

class demoMethod1
{
	public void disp()			//method implementation
	{
		System.out.println("Name is Brij");
		System.out.println("Surname is Kotak");
	}
	public static void main(String args[])
	{
		demoMethod1 obj=new demoMethod1();
		obj.disp();			//calling statement
	}
}