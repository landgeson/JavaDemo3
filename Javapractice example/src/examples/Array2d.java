package examples;

import java.util.Scanner;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows= sc.nextInt();
		int cols=sc.nextInt();
		
		int [][]numbers= new int [rows][cols];
		
		//input
		
		for (int i=0;i<rows;i++) {
			
		for (int j=0;j<cols;j++) {
			numbers[i][j]= sc.nextInt();
		}
		}
		System.out.println("Entre value of x:");
	       int x = sc.nextInt();
	      
		for (int i=0;i<numbers.length;i++) {
			
			for (int j=0;j<numbers.length;j++)
				if (numbers[i][j]==x)
				{
					 System.out.print("x found at index("+ i + "," + j + " )");
					
			}
			System.out.println();
		}
	}
	
	
    }

