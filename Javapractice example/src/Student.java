
class Student{
	    String name;
	    int age; 
	
	

	public void StudentInfo(String name) {
		System.out.println(name);
		

	}
	public void StudentInfo(int age) {
		System.out.println(age);
		

	}
	public void StudentInfo(String name,int age) {
		System.out.println(name+" "+age);
		

	}
	
	public static void main(String args[]) {
		
		Student s1= new Student();
		s1.name="sonali";
		s1.age=24;
				s1.StudentInfo(s1.name,s1.age);
				
		
		
		
	}
	
}
