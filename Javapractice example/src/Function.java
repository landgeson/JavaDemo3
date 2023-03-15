
public class Function {
	
	
	
	public static void isPrime(int n)	{
		
		
		for(int i=2;i<=n/2;i++) {
		
		if (n%i==0) {
			
			System.out.println("number is not prime");
			return;
		}
		
		
		}
		System.out.println("number is prime number");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=11;
		

		
		isPrime(n);
		
		
		
		
				
				
		

	}

	

}
