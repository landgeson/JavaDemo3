package examples;

import java.util.Scanner;

public class ArrayFuction {
	
	
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
       int size = sc.nextInt();
       int[] Number= new int[size];
       
       //Input
       for (int i=0;i<size;i++) {
    	   Number[i] = sc.nextInt();  
    	   
       }
       System.out.println("Entre value of x:");
       int x = sc.nextInt();
    	   
       
       
       //output
       for (int i=0;i<Number.length;i++) {
    	   
    	   System.out.println(Number[i]);
    	   if (Number[i]==x) {
    		   
    		   System.out.println("x found at index:"+ i);
    	   }
       }
   }

	

	


	}


