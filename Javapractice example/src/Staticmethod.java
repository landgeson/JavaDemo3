
public class Staticmethod {
	
	static void Display() {
		System.out.println("new");
	}

	public static void main(String[] args) {
		 Staticmethod.Display();
       Xyz.show();
	}
}
	 class Xyz {
		static void show() {
			System.out.println("2");
			
		
	}

}
