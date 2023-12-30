package day4_loops;

public class FotLoops {
public static void main(String[] args) {
		
		String  str = "Poonam";
		
		
		String[] strArray = new String[5]; // Declaration 
		
		strArray[0] = "Ujwal";
		strArray[1] = "Dipti";
		strArray[2] = "Elvish";
		strArray[3] = "Frank";
		strArray[4] = "Garotte";
		
		
		System.out.println(strArray);
		
		
		// 1. Traditional For Loop
		System.out.println("******************Traditional For Loop******************");
		for(int i=0;i<5;i++) {
			
			System.out.println(strArray[i]);
			
		}
		
		
		// 2. For Each Loop
		
		System.out.println("******************For Each Loop******************");
		
		for(String tempVar : strArray) {
			
			System.out.println(tempVar);
			
			// 1. The array gives the value to temporary variable declared in for loop
			// 2. The temporary variable stores the value
			// 3. The variable now enters the loop scope
			// 4. Based on the business logic this value will help compare or print  
		}
		
	
		
		
		
		
		
	}

}
