package day7_String_Manipulation;

public class StringOperations {

	public static void main(String[] args) {
		String s  = "Joe Biden is the president of the United States of America in the North ";
		
		String s0 = "Joe Biden is the president of United States";
		String s1 = "Joe Biden is the president of United States";
		String s2 = "Joe Biden is the President of United States";

		// Common operations on String

		/*System.out.println("length of String ->"+s.length());
		
		System.out.println("Index of d --> "+ s.indexOf('d'));// 6
		
		System.out.println("Index of d after 23th position--> "+ s.indexOf('d',23));//
		
		System.out.println("Second Index of d --> "+ s.indexOf('d',s.indexOf('d')+1));//22
				
		
		System.out.println("Index of the --> "+ s.indexOf("the"));// 6
		
		System.out.println("Index of the after 36th position--> "+ s.indexOf("the",36));//
		
		System.out.println("Second Index of the --> "+ s.indexOf("the",s.indexOf("the")+1));//22
		
		
		System.out.println("Find the char at particular index -->"+s.charAt(6));
		
		
		System.out.println(s0.equals(s1));
		System.out.println(s0.equals(s2));
		System.out.println(s0.equalsIgnoreCase(s2));
		
		String s3  = "Joe Biden is the president of the United States of America in the North";

		
		// Substring
		
		System.out.println(s3.substring(10));
		System.out.println(s3.substring(17, 30));
		
		System.out.println(s3.substring(s3.indexOf("is"),s.indexOf("States")));
		
		// Trim
		
		String s4 = "         Joe               Biden is the president of United States           ";
		System.out.println(s4);
		System.out.println(s4.trim());
	*/
		
		// Replace 
		String s5  = "Joe Biden is the president of the United States of America in the North ";
		System.out.println(s5);
		System.out.println(s5.replace(" ","_"));
		System.out.println(s5.replace("the","thier"));
		
		
		// Split
		String s6="Joe_Biden_is_the_president_of_the_United_States_of_America_in_the_North";
		
		String[] str=s6.split("_");
		
		for(String si:str) {
		System.out.println(si);
		
		}
		
	}

}
