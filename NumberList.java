import java.util.ArrayList;

/**
	A class that uses an array to maintain a list
	of numbers.
**/
public class NumberList {

	//data members
	private int count;
	private int[] numbers;

	public NumberList() {
		this.count = 0;
		this.numbers = new int[2];
	}

	public void addFirst(int x) {

		//what happens if the list is full?
		if(numbers.length == count) {
			//TODO!
			//create new array that is larger (2x)
			int[] newArray = new int[count*2];

			//copy all items over to the new array
			for(int i = 0; i < count; i++) {
				newArray[i] = numbers[i];
			}

			//move the reference from the old array to the new array
			numbers = newArray;

		}

		//move all existing items down one space
		for(int i = count-1; i >= 0; i--) {
			numbers[i+1] = numbers[i];
		}

		//add new item at position 0
		numbers[0] = x;

		//update count
		count++;

	}

	public String toString() {

		String result = "";
		for(int i = 0; i < count; i++) {
			result += numbers[i] + " ";
		}
		return result;

	}

	public void removeFirst() throws EmptyListException {

		if(count == 0) {
			EmptyListException ele = new EmptyListException("Cannot remove item from empty list!");
			throw ele;
		}

		//start at the beginning
		// move each item up
		for(int i = 0; i < count-1; i++) {
			numbers[i] = numbers[i+1];
		}

		//update count
		count--;

	}

	public int count11s() {

		int appearances = 0;

		for(int i = 0; i < count; i++) {
			if(numbers[i] == 11) {
				appearances++;
			}
		}
		
		return appearances;

	}

	public ArrayList<Integer> find11s() {

		ArrayList<Integer> locations = new ArrayList<Integer>();

		for(int i = count-1; i >= 0; i--) {

			if(numbers[i] == 11) {
				locations.add(i);
			}

		}

		return locations;

	}

}