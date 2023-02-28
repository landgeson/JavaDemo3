import java.util.Scanner;

public class Practicexample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /* 1) String name= "Sonali";
   int age= 60;
   String neighbour ="Akku";
   
   String friend= neighbour;
   
   System.out.println("value of name;"+ name);
   
   System.out.println("value of age;"+ age);
   System.out.println("value of neighbour;"+ neighbour);
   System.out.println("value of friend;"+ friend);
   
   
    * 
    
	//Non primitive 
		
	1)	String name1 = "Aman";
		String name2 = "Akku";
		String name3= name1+ " and " + name2;
		
		System.out.println (name3); 
		
		 2) String name= "Aman";
		System.out.println(name.charAt(0));
	
		 3) String name="sonali";
		System.out.println(name.length());
		 
		4) String name= "Aman";
		String name2= name.replace ('a','b');
		System.out.println(name2);  
	
	 5) String name = "AmanandAkku";
	 System.out.println(name.substring(0,7)); */
		
		
		Scanner sc =new Scanner(System.in);

	      int cash=sc.nextInt();
	     if (cash<10)
	     {
	         System.out.println("can not buy anything");
	         System.out.println("get more cash");
	         }
	  else  if (cash<50 && cash>10)          {
	            System.out.println("buy one thing");
	}

	else
	        System.out.println("buy both things");
	}

}
