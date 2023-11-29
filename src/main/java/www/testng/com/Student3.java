package www.testng.com;

public class Student3 {
	
	int id;
	String name;
	String city;
	
	Student3(int i,String n)
	{
		id =i;
		name=n;
	}
	
	Student3(int i,String n,String c)
	{
		id=i;
		name=n;
		city=c;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+city);
	}

	public static void main(String[] args) {
		
		Student3 obj1 = new Student3(1,"Tanvi");
		
		Student3 obj2 = new Student3(2,"Ram","Pune");
		
		obj1.display();
		
		obj2.display();
		
		
		

	}

}
