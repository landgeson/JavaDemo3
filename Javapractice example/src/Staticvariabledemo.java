class Employee {
	
	int empid;
	String name;
	static String company="Tcs";
	

	Employee (int empid,String name){//Constructor
		
		this.empid=empid;
		this.name=name;
		
	}
	void Display() {
		
		System.out.println(empid+" "+name+" "+company);
	}
}

public class Staticvariabledemo {
	
	

	public static void main(String[] args) {
		Employee e1=new Employee(24,"Ankita");
		e1.Display();
		Employee e2=new Employee(35,"monali");
		e2.Display();
		

	}

}
