package day15_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

	public static void main(String[] args) {
		/*ArrayList<String> arl1 = new ArrayList<String>();
		ArrayList<String> arl2 = new ArrayList<String>();
		ArrayList<String> arl3 = new ArrayList<String>();
		// 1. add - To assign value to list
		arl1.add("Dipti");
		arl1.add("Anjali");
		arl1.add("Manisha");
		arl2.add("Pooja");
		arl2.add("Rajesh");
		arl2.add("Meeraj");
		arl3.add("Nikhil");
		arl3.add("Poonam");
		arl3.add("Bharti");

		System.out.println("list 1: " + arl1);
		System.out.println("list 2: " + arl2);
		System.out.println("list 3: " + arl3);

		// 2. addAll - To merge two array list

		arl1.addAll(arl2);

		System.out.println("After Add all list 1: " + arl1);
		System.out.println("After Add all list 2: " + arl2);

		// 3. addAll - With Index - Merges two array from mentioned index

		arl1.addAll(2, arl3);

		System.out.println("After Add all with index list 1: " + arl1);

		// 4. clear - To empty the Array List

		System.out.println("Before Clearing list 3: " + arl3);

		arl3.clear();

		System.out.println("Cleared list 3: " + arl3);

		// 5. Clone - This method return an instance of ArrayList which we need to type
		// cast and assign to a new ArrayList where we want to clone

		ArrayList<String> Cloner = (ArrayList<String>) arl1.clone();
		System.out.println("arl1 data before clone :" + arl1);
		System.out.println("Cloned Object :" + Cloner);

		// 6. contains - Checks and return true if the element is found in list
		// (Parameter is single element)

		System.out.println("Does arl1 Contains Nikhil :" + arl1.contains("Nikhil"));
		System.out.println("Does arl1 Contains Raju :" + arl1.contains("Raju"));

		// 7. containsAll - return true if all the elements in one list is found in
		// other list (Parameter is ArrayList)

		ArrayList<String> arl4 = new ArrayList<String>();
		ArrayList<String> arl5 = new ArrayList<String>();

		arl4.add("Pooja");
		arl4.add("Meeraj");

		arl5.add("Dipti");
		arl5.add("Prakhar");

		System.out.println("arl1 : " + arl1);
		System.out.println("arl4 : " + arl4);
		System.out.println("arl5 : " + arl5);

		System.out.println("Does arl1 Contains all values of arl4 :" + arl1.containsAll(arl4));
		System.out.println("Does arl1 Contains all values of arl5 :" + arl1.containsAll(arl5));

		// 8. Arrays.asList() - To assign multiple value at one go by passing through
		// constructor
*/
		ArrayList<String> arl6 = new ArrayList<String>(
				Arrays.asList("Siddhart", "Akshay", "Arjun", "Akshay", "Varun","Akshay"));
/*
		System.out.println("arl6 :" + arl6);

		// 9. indexOf - return the index no of data stored in list

		System.out.println("index of Akshay :" + arl6.indexOf("Akshay"));

		System.out.println("index of Hritik :" + arl6.indexOf("Hritik"));

		// 10. LastIndexOf - Returns the index of the last occurrence of the specified
		// element in this list or -1 if this list does not contain the element.

		System.out.println("index of Varun :" + arl6.lastIndexOf("Varun"));

		System.out.println("index of Akshay :" + arl6.lastIndexOf("Akshay"));

		// 11.size - Returns the size of ArrayList
		
		System.out.println("Size of arl6 :"+arl6.size());
		
		//11. remove - 
		//a. with index - Removes the element at the specified position in this list.Shifts any subsequent elements to the left (subtracts one from theirindices).
		
		//System.out.println("before removing 1 index from arl6 :"+arl6 );
		
		//arl6.remove(1);
		
		//System.out.println("arl6 with removed index value of 1:"+arl6 );
		
		//b. with object - Removes the first occurrence of the specified element from this list,if it is present. If the list does not contain the element, it is unchanged.
		
        //System.out.println("before removing Akshay index from arl6 :"+arl6 );
		
		//arl6.remove("Akshay");
		
		//System.out.println("arl6 with removed object value of Akshay:"+arl6 );
		
		//c. removeAll - Removes from this list all of its elements that are contained in the
		//specified collection
		ArrayList<String> arl7 = new ArrayList<String>();
		arl7.add("Akshay");
		arl7.add("Varun");
		
		System.out.println("before removeAll :"+arl6 );
		
		arl6.removeAll(arl7);
		
		System.out.println("After removeAll for object value of Akshay and Varun :"+arl6 );
		
		
		//d. removeIf - Removes all of the elements of this collection that satisfy the 
		//given predicate.
		
		ArrayList<String> arl8 = new ArrayList<String>();
        arl8.add("Apple");
        arl8.add("Banana");
        arl8.add("Orange");
        arl8.add("Mango");

        System.out.println("UnModified List: " + arl8);
        
        // Using removeIf to remove elements that start with the letter 'A'
        arl8.removeIf(y -> y.startsWith("A"));        
                
        // Displaying the modified list
        System.out.println("Modified List: " + arl8);
		
        
        ArrayList<Integer> arl9 = new ArrayList<Integer>(
				Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        
        System.out.println("All Number :"+arl9);

        
        arl9.removeIf(str -> str%2!=0);
        
        System.out.println("Even Number :"+arl9);
        
        //12. retainAll(Singleton and List) - Retains only the elements in this list that are 
        //contained in the specified collection. 
        //In other words, removes from this list allof its elements that are not 
        //contained in the specified collection.
        
        // Singleton
        
        System.out.println("List  :"+arl6);
        
        arl6.retainAll(Collections.singleton("Akshay"));
        
        System.out.println("List after retainAll Singleton :"+arl6);
        */
        //List
        ArrayList<String> arl10 = new ArrayList<String>();
        arl10.add("Akshay");
        arl10.add("Varun");
        
        System.out.println("List  :"+arl6);

        arl6.retainAll(arl10);
        
        System.out.println("List after retainAll List :"+arl6);

       //13. SubList - Returns a view of the portion of this list between the 
        //specified fromIndex, inclusive, and toIndex, exclusive. 
        //(If fromIndex and toIndex are equal, the returned list isempty.)
        
        ArrayList<Integer> arl19 = new ArrayList<Integer>(
				Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        
        System.out.println("All Number :"+arl19);
        
       // ArrayList<Integer> arl11 = new ArrayList<Integer>(arl19.subList(2, 7));
        
       // System.out.println(arl11);
        
        
        
        //14. toArray - Returns an array containing all of the elements in this 
        //list in proper sequence (from first to last element), with return type Object
        
        Object[] ui  =  arl19.toArray();
        
        for(Object i:ui) {
        	
        	System.out.println(i);
        }
        
        //15. How to remove specific range of index from list - list.subList(from, to).clear();

       /* arl19.subList(2, 7).clear();
        
        System.out.println("All Number after sublist and clear :"+arl19);
*/
        
	}

}

