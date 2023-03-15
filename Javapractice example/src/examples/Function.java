package examples;

import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
	       int Len = sc.nextInt();
	    	   
	       int []number= new int [Len];
	       
	       for (int i=0;i<Len;i++) {
	    	  
	    	   
	    	   number[i]=sc.nextInt();
	    	   
	    	   
	       }
	       for (int i=0;i<Len;i++) {
	    		   
	       System.out.println(i+ " ");
	       }
	      
	       
	}

}
