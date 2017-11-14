import java.util.ArrayList;
import java.util.HashMap;

public class HashMapFun {

	public static void main(String[] args) {

		//an example showing how to update a count in a HashMap
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);

		for(int i: map.values()) {
			System.out.println(i);
		}

		int value = map.get("b");
		value++;
		map.put("b", value);

		System.out.println("*********");
		for(int i: map.values()) {
			System.out.println(i);
		}


		//An example showing how to keep track of a complex value.
		HashMap<String, ArrayList<Integer>> phoneNums = new HashMap<String, ArrayList<Integer>>();

		//put
		ArrayList<Integer> samisNums = new ArrayList<Integer>();
		samisNums.add(2024);
		phoneNums.put("Sami", samisNums);

		ArrayList<Integer> rosasNums = new ArrayList<Integer>();
		rosasNums.add(5968);
		rosasNums.add(8888);
		phoneNums.put("Rosa", rosasNums);
		
		ArrayList<Integer> gregsNums = new ArrayList<Integer>();
		gregsNums.add(2265);
		phoneNums.put("Greg", gregsNums);

		String newName = "Bob";
		int newNumber = 3456;

		add(newName, newNumber, phoneNums);
		// add("Bob", 7777, phoneNums);
		// add("Jeff", 6524, phoneNums);

		for(ArrayList<Integer> list: phoneNums.values()) {
			System.out.println(list);
		}

	}	

	/**
		Add a new item to the map.
	**/
	public static void add(String key, int value, HashMap<String, ArrayList<Integer>> map) {

		//does not exist in the map already
		if(!map.containsKey(key)) {
			//create a new array list
			ArrayList<Integer> list = new ArrayList<Integer>();
			//add value to the list
			list.add(value);
			//put the value into the map
			map.put(key, list);

		} else {
			ArrayList<Integer> list = map.get(key);
			list.add(value);
			//map.put(key, list);
		}


	}

}