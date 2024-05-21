class demoCons
{
	public demoCons()		//default / implicit / zero argumented constructor
	{
		System.out.println("It is the default construtor");
	}
	public demoCons(String nm)
	{
		System.out.println("Argument value is:"+nm);
	}
	public demoCons(int a,int b)
	{
		System.out.println("Addition of argument values:"+(a+b));
	}
	public static void main(String args[])
	{
		demoCons d1=new demoCons();		//Calling of default constructor
		demoCons d2=new demoCons("ABC");	//Calling of string constructor
		demoCons d3=new demoCons(10,20);	//Calling of int constructor	
	}
}