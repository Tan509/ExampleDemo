package www.testng.com;

public class Student1 {
	
	int id=10;
	String name = "tanvi";
	
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		
		Student1 obj1 = new Student1();
		
		Student1 obj2 = new Student1();
		
		obj1.display();
		
		obj2.display();
		
		

	}

}
