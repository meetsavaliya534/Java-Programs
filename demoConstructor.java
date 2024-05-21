class demoConstructor
{
	public demoConstructor()	//default constructor / implicit constructor / zero argumented constructor
	{
		System.out.println("Default Constrcutor");

	}
	public demoConstructor(int a,int b)	//Argumented Constructor
	{
		System.out.println("Addition of numbers is:"+(a+b));
	}
	public demoConstructor(String name)	//Argumented Constructor
	{
		System.out.println("Username is:"+name);
	}
	public static void main(String args[])
	{
		demoConstructor d1=new demoConstructor();	//Calling of default constructor
		demoConstructor d2=new demoConstructor(15,20);
		demoConstructor d3=new demoConstructor("ABC");
	}
}