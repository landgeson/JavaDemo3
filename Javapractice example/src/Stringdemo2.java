

public class Stringdemo2 {

	public static void main(String[] args) {
		 StringBuilder sb =new StringBuilder ("Sonali");
		
		/* System.out.println(sb);
		
		//sb.CharAt index 0
		//System.out.println(sb.charAt(0));
		
		//setcharAt index 0
		sb.setCharAt(0 ,'M');
		System.out.println(sb);
		
		//deleteCharAt index 0
		
		sb.delete(2,4);
		System.out.println(sb);
		
		/*
		//insert at index 3
		
		//sb.insert (2, 'n');
		//System.out.println(sb);
		
		//calculate the length
		
		System.out.println(sb.length());
		
		//print the string about that length
		sb.setLength(4);
		System.out.println(sb);
		
		
		//StringBuilder sb =new StringBuilder ("h");
		
		sb.append ('e');//str=str+"e"
		sb.append ('l');//str=str+"l"
		sb.append ('l');//str=str+"l"
		sb.append ('o');//str=str+"o"
		
		System.out.println(sb);  */
		 
		 
		 for(int i=0;i<sb.length()/2;i++) {
			 
			 int front=i;
			 int back= sb.length()-1-i;// 6-1-5
			 
			 char frontChar= sb.charAt(front);
			 char backChar= sb.charAt(back);
			 
			 sb.setCharAt(front,backChar);
			 sb.setCharAt(back,frontChar);
			 
		 }
		 System.out.println(sb);
		

	}

}
