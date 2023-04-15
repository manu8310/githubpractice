class Employee 
{
	String name;
	int age;
	long mobno;
	String gmail;
	Employee()//no argument constructor
	{
	}
	Employee(String name,int age,long mobno,String gmail)
	{
		this.name=name;
		this.age=age;
		this.mobno=mobno;
		this.gmail=gmail;
	}
	public void employeeDetails()
	{
		System.out.println(name+" "+age+" "+mobno+" "+gmail);
	}
}
