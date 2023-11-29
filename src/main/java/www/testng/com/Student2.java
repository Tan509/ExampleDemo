package www.testng.com;

public class Student2 {

	
	int id;
	String name;
	
	Student2(int i,String n)
	{
		id=i;
		name=n;
	}
	
	void display()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		Student2 obj1 = new Student2(111,"Tanvi");
		
		Student2 obj2 = new Student2(112,"Kiyansh");
		
		obj1.display();
		
		obj2.display();



	}

}
