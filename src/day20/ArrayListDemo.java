package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		// Declaration
		// ArrayList mylist = new ArrayList(); //Declaration 1 - Heterogeneous data
		// List mylist1 = new ArrayList(); //Declaration 2
		// ArrayList <String>mylist3 = new ArrayList<String>(); //To store only
		// homogeneous data
		// ArrayList <Employee>mylist4 = new ArrayList<Employee>();

		ArrayList mylist = new ArrayList();
		// Adding data into ArrayList
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add(null);

		// Size of ArraytList
		System.out.println("Size of an ArrayList" + mylist.size());

		// Printing ArrayList
		System.out.println("Printing Value of ArrayList " + mylist);

		// Remove one of the element/item/obj
		mylist.remove(5); // 5 is the index of the element, index starts from zero
		System.out.println("After removing 100 from ArrayList " + mylist);

		// Insert element in middle of ArrayList
		mylist.add(2, 1829);
		System.out.println("After inserting the value " + mylist);

		// Modify element the value in ArrayList
		mylist.set(3, "Java");
		System.out.println("After Modifying the value " + mylist);

		// Access specific from ArrayList
		mylist.get(3);
		System.out.println("Specific element is " + "'" + mylist.get(3) + "'");

		// Reading all the elements from ArrayList
		// Approach 1: For loop
		System.out.println("------For Loop------");
		for (int i = 0; i < mylist.size(); i++) {
			System.out.println(mylist.get(i));
		}

		// Approach 2: Enhanced For loop
		System.out.println("------Enhanced Loop------");
		for (Object x : mylist) { // We don't know what type off data, it may have heterogeneous so we commonly
									// specify Object
			System.out.println(x);
		}

		// Approach3: Iterator - Only for Collections
		System.out.println("------Iterator------");
		Iterator it = mylist.iterator();
		
		while (it.hasNext()) {	//hasNext is check whether the element is present or not. It will check on by one
			System.out.println(it.next()); //Next will retrieve the value
		}
		
		//Iterator <String> it = mylist.iterator(); //if my collection contain only String, Integer, Employee homogeneous
		//Iterator <Integer> it = mylist.iterator(); 
		//Iterator <Employee> it = mylist.iterator(); 
		//Iterator <Object> it = mylist.iterator(); 

		System.out.println();
		//Checking ArrayList is Empty or not
		System.out.println(mylist.isEmpty());
		
		//Randomly remove data from ArrayList
		ArrayList mylist2 = new ArrayList();
		mylist2.add(10.5);
		mylist2.add("Welcome");
		
		mylist.removeAll(mylist2);
		System.out.println(mylist);
		
		// Remove all the data from ArrayList3
		mylist.clear();
		System.out.println(mylist);
		System.out.println(mylist.isEmpty());
	}

}
