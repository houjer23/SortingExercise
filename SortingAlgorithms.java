// By Jerry Hou
// This class will have three slow sorting methods

public class SortingAlgorithms {
	
	// The unsorted array
	private int[] arr = new int[100];
	
	// Constructor place holder
	public SortingAlgorithms() {}
	
	public void bubbleSort() { // start of bubble sort method
		int[] copy = makeCopy();
		int num_swap = 0;
		for (int i = 0; i < copy.length; i ++) {
			// loop through n times it is sure that each number is popped up
			for (int j = 0; j < copy.length - i - 1; j ++) {
				// Largest number bubbles up evertimes compare
				if (copy[j] > copy[j + 1]) {
					int temp = copy[j];
					copy[j] = copy[j + 1];
					copy[j + 1] = temp;
					num_swap ++; // track the number of swaps
				}
			} // end of the inside array
		} // end of the outside array
		System.out.println(num_swap);
	} // end of bubble sort method
	
	public void insertionSort() { // start of insertion sort method
		int[] copy = makeCopy();
		int num_swap = 0;
		for (int i = 1; i < copy.length; i ++) {
			int element = copy[i]; // this element will be put into the front -- sorted section
			for (int j = i; j > 0; j --) {
				// loop through sorted section and put the element into the right place
				if (copy[j - 1] > copy[j]) {
					copy[j] = copy[j - 1];
					copy[j - 1] = element;
					num_swap ++;
				} else {
					break;
				}
			} // end of the inside array
		} // end of the outside array
		System.out.println(num_swap);
	} // end of insertion sort method
	
	public void selectionSort() {
		int[] copy = makeCopy();
		int num_swap = 0;
		for (int i = 0; i < copy.length - 1; i ++) {
			int min = i;
			for (int j = i + 1; j < copy.length; j ++) {
				// finding the index of the smallest number
				if (copy[min] > copy[j]) {
					min = j;
				}
			}
			// switch the selected smallest number with the current index
			num_swap ++;
			int temp = copy[i];
			copy[i] = copy[min];
			copy[min] = temp;
		}
		System.out.println(num_swap);
	}

	// This method makes a new array so that it will not change the original array
	public int[] makeCopy() { // start of the make copy method
		int[] copy = new int[arr.length];
		for (int i = 0; i < arr.length; i ++) {
			copy[i] = arr[i];
		}
		return copy;
	} // end of the make copy method
}
