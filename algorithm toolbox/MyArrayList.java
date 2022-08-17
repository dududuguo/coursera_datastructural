
public class MyArrayList {

	private static final int MAX_SIZE = 6;

	//The array to store the data.
	public final int[] data;
	private int size;

	//Constructor
	public MyArrayList() {
		data = new int[MAX_SIZE];
		size = 0;
	}

	//Add element value to the end of the list
	//return true if the element is added,
	//false if there's no space left
	public boolean add(int value) {
		if (size >= MAX_SIZE) {
			return false;
		}
		data[size++] = value;
		return true;
	}


	//Return the element at position
	//You don't have to worry about
	//positions less than 0 or greater
	//than the array length - 1, but you
	//do have to worry about positions that are
	//after the end of the list. In that case
	//return 0.
	public int get(int position) {
		if (position >= size) {
			return 0;
		}
		return data[position];
	}

	//Return the current size of the list
	//te that this may be different to
	//the length of the array.
	public int size() {
		return size;
	}

	//Replace the element at position with value
	//Return true if the replacement happened,
	//false otherwise.
	public boolean overwriteWith(int position, int value) {
		if (position >= size) {
			return false;
		}
		data[position] = value;
	    return true;
	}

	//Replace the data in the list with
	//the elements of other. If other
	//is smaller than the current list,
	//the current list will get smaller.
	public void overwriteWith(MyArrayList other) {
		int newSize = other.size();
		for (int i = 0; i < newSize; i++) {
			if (i >= size) {
				break;
			}
			overwriteWith(i, other.get(i));
		}
		this.size = newSize;
	}
}


