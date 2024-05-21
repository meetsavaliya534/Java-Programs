 class thisConst
{
	public thisConst()
	{
		this(25,35);		//Call to the second constructor
		System.out.println("It is default constructor::");
		
	}
	public thisConst(int a,int b)
	{
		System.out.println("Given value is:"+a+" Second value is:"+b);
	}
	public static void main(String args[])
	{
		thisConst t1=new thisConst();	//calling statement of default constructor
	}


}