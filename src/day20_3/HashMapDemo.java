package day20_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		//Map<Integer,String> mp = new HashMap<Integer,String>();
		
		//Adding Pairs
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "Mary");
		hm.put(104, "Scott");
		hm.put(105, "David");
		System.out.println(hm);
		
		//Size of HashMap
		System.out.println(hm.size()); //{101=John, 102=Scott, 103=Mary, 104=Scott, 105=David} -- {} Representing List
		
		//Remove one pair
		hm.remove(103);	//103 is key of the pair
		System.out.println("After removing pair " +hm);
		
		//Access value of the particular key
		System.out.println(hm.get(102));
		
		//Retrieve all the keys from the HashMap
		System.out.println(hm.keySet()); //[101, 102, 104, 105]
		
		//Retrieve all the values from the HashMap
		System.out.println(hm.values()); //[John, Scott, Scott, David]
		
		//Retrieve Keys + Values
		System.out.println(hm.entrySet()); //[101=John, 102=Scott, 104=Scott, 105=David] -- [] Representing Set
		
		//Reading Data from Hashmap
		
		//Using Enhanced
		for(int k : hm.keySet()) {
			System.out.println(k+"  "+hm.get(k));
		}
		
		//Using Iterator
		System.out.println("---Iterator---");
		Iterator <Entry<Integer, String>> it =hm.entrySet().iterator();
		while(it.hasNext()) {
			Entry  entry = it.next(); //.next return every entry in it
			System.out.println(entry.getKey()+"   "+entry.getValue());
			
		}
		
		hm.clear();
		System.out.println(hm);
		System.out.println(hm.isEmpty());
	}

}
