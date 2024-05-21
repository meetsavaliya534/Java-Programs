class demoFunc
{
	public void display()		//no return no argument method
	{
		
		System.out.println("Welcome to OOP Methods");

	}
	public static void main(String args[])
	{
		System.out.println("It is an example of Methods in Java");
		demoFunc f=new demoFunc();		//Object creation
		f.display();				//Method Calling

	}
}