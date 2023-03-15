package examples;

import java.util.Scanner;

public class Keyfunction {
	
	
public static void main(String[] args) {
	
	int positive=0,Negative=0 , Zero=0;
	
	System.out.println("Press 1 to contine & 0 to stop");
	Scanner sc= new Scanner(System.in);
	
	int input = sc.nextInt();
	
	
	
	while (input == 1) {
			
			System.out.println("Entre your number:");
			int number = sc.nextInt();
			
			if (number>0) {
				positive ++;
			}
			else if (number<0)
			{
				Negative++;
			}else {
				
				Zero ++;
			}
		
	System.out.println("Prss 1 to contine & 0 to stop");
		input = sc.nextInt();
	}	
	System.out.println("Positives :" + positive);
	System.out.println("Negatives :" + Negative);
	System.out.println("Zeros :" + Zero);
}
          

}