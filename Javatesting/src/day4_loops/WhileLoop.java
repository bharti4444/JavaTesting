package day4_loops;

public class WhileLoop {
	public static void main(String[] args) {
        int[] intArray = new int[5]; // Declaration 
		
        intArray[0] = 25000;
        intArray[1] = 35000;
        intArray[2] = 45000;
        intArray[3] = 55000;
        intArray[4] = 65000;
        
        int i=0;
        
        while(i<5) {
        	
        	System.out.println(intArray[i]);
        	i++;
        }

	}

}


