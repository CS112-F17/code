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
		this.numbers = new int[10];
	}

	public void addFirst(int x) {

		//what happens if the list is full?
		if(numbers.length == count) {
			//TODO!
			//create new array that is larger (2x)

			//copy all items over to the new array

			//move the reference from the old array to the new array

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

}