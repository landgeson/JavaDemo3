package examples;

class Student {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}
public class AccessModifiers {
    public static void main(String[] main){
        Student s1 = new Student();

        // access the private variable using the getter and setter
        s1.setName("xyz");
        System.out.println("The name of Student:"+ s1.getName());
    }
}