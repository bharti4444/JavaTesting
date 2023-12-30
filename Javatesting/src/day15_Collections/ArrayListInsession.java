package day15_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListInsession {
	public static void main(String[] args) {

		int[] i = new int[3];
		i[0] = 11;
		i[1] = 21;
		i[2] = 31;
		// i[3]=41;

		System.out.println(i.length);

		List obj = new ArrayList();
		obj.add("Snehal");
		obj.add(200000);
		obj.add('F');
		obj.add(30.15);

		System.out.println(obj.size());

		for (int j = 0; j < obj.size(); j++) {

			System.out.println("Value in arraylist :" + obj.get(j));

		}

		// System.out.println(obj.get(-2));

		// System.out.println(obj.get(4));

		List<String> lister = new ArrayList<String>();
		List<Integer> lister1 = new ArrayList<Integer>();
		List<Double> lister2 = new ArrayList<Double>();
		List<Character> lister3 = new ArrayList<Character>();

		lister.add("Tushar");
		lister.add("Snehal");
		lister.add("Anjali");
		lister.add("Ujwal");

		
		System.out.println("************** Traditional For Loop *****************");
		for (int j = 0; j < lister.size(); j++) {	
			System.out.println("Value in arraylist lister:" + lister.get(j));
			if(lister.get(j).equals("Anjali")) {				
				System.out.println("Student found");
				break;
			}

		}
		System.out.println("************** For Each Loop *****************");
		
		for(String str:lister) {
			System.out.println("Value in arraylist lister:" + str);
			if(str.equals("Anjali")) {				
				System.out.println("Student found");
				break;
			}
			
		}
		
		System.out.println("************** For Each Loop Lamda *****************");
		
		
		lister.forEach( st -> System.out.println("Value in arraylist lister:" +st));
		
		
		System.out.println("************** Iterator *****************");
		
		lister1.add(11);
		lister1.add(21);
		lister1.add(31);
		lister1.add(41);
		
		
		
		Iterator<Integer> ul = lister1.iterator();
		
		while(ul.hasNext()) {
			int y=ul.next();
			System.out.println(y);
			if(y==21) {
				break;
				
			}
		}
		

	}
	
	
	

}


