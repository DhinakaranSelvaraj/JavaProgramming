package day20_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// Declaration
		HashSet myset = new HashSet();
		Set myset1 = new HashSet();
		HashSet<Integer> myint = new HashSet<Integer>(); // For homogeneous data

		// Adding Element into HashSet
		System.out.println("Adding Element into HashSet");
		myset.add(100);
		myset.add(10.23);
		myset.add("Welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);

		System.out.println(myset); // [null, A, 100, Welcome, 10.23, true] - Insertion order not preserved
		// Removed Duplicate order
		// Not allowed multiple Nulls
		
		//Size of HashSet
		System.out.println("Size of a HashSet "+myset.size());
		
		// Remove specific element from HashSet
		myset.remove(10.23); // 10.23 is a value not Index
		System.out.println("After removing 10.23 " + myset); // [null, A, 100, Welcome, true]

		// Inserting element - It is not possible in HashSet (Bcz it is not following proper order)

		// Access specific element - It is not possible in HashSet (Bcz it is not following proper order)
		// Indirect Approach (Workaround) after converting HashSet to ArrayList
		ArrayList al = new ArrayList(myset);
		System.out.println(al.get(2)); // Access specific element

		// Read all the element using looping statement
		// HashSet not allows normal for-loop bcz it is not following Indexing
		System.out.println("---ForLoop---");
		for (Object x : myset) { // Enhanced For-Loop
			System.out.println(x);
		}

		// Using Iterator
		System.out.println("---Iterator---");
		Iterator<Object> it = myset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// We cannot remove multiple values in HashSet

		// Clearing all the elements in HashSet
		myset.clear();
		System.out.println(myset);

		System.out.println(myset.isEmpty());

	}

}
