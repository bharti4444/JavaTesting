package day4_loops;

public class DoWhileLoop {
public static void main(String[] args) {
		
		int whiler=0;
		int doWhile=0;
		
		// the basic difference between while and do while is that do while will execute the block atleast one time
		
		// In do while first the code will execute atleast once and then condition will be checked
		// In while first condition will be checked then code will be executed
		
		
		do {
			System.out.println(doWhile);
			doWhile++;			
		}
		while(doWhile>3);
		
		System.out.println("Do While Loop ended");
		
		while(whiler>3) {
			
			System.out.println(whiler);
			whiler++;
			
		}
		
		System.out.println("While Loop ended");
		
		
		

	}
}
