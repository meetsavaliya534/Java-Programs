/* Write a java program that take 2 employee name,salary and designation(post) from user. Display the details in display method. display have not any arguments. Find the highest salary in max() method. */ 

class empData
{
	String empnm=null;
	int salary=0;
	String des=null;
	
	empData(String nm,int s,String d)
	{
		empnm=nm;
		salary=s;
		des=d;
	}
	public void display()
	{
		System.out.println("Name:"+empnm);
		System.out.println("Salary:"+salary);
		System.out.println("Designation:"+des);
	}
	public void max(int s1,int s2)
	{
		if(s1>s2)
		{
			System.out.println("Employee 1 salary is high:");
		}	
		else
		{
			System.out.println("Employee 2 salary is high");
		}
	}
	public static void main(String args[])
	{
		empData e1=new empData("ABC",10000,"Supervisor");
		e1.display();
		
		empData e2=new empData("XYZ",5000,"Worker");
		e2.display();

		e2.max(10000,5000);		
	}

}