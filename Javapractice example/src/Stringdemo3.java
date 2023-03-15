import java.util.Scanner;

public class Stringdemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size= sc.nextInt();
		
		String[] a= new String [size];
		
		int totlength=0;
		
		for (int i=0;i<size;i++) {
			
			a[i]= sc.next();
			
			totlength += a[i].length();
			

		}
		
       System.out.println("Combine length of array :"+totlength); 
	}

}
