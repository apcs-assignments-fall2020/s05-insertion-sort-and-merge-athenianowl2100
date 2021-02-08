import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        ArrayList<Integer> output = new ArrayList<Integer>();

		// Loop through list to be sorted
		for (int i = 0; i < list.size(); i++) {
			// Get the next element to sort
			int item = list.get(i);

			// Find where to insert it in the sorted array
			int index = output.size();
			for (int j = 0; j < output.size(); j++) {
				// We insert before the first number that
				// is larger than the value we are inserting
				if (output.get(j) > item) {
					index = j;
					break;
				}
			}

			// Insert the element
			output.add(index, item);;
		}

		return output;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        // Indices to keep track of location in input and output arrays
        int idx1 = 0;
        int idx2 = 0;
        int outputIdx = 0;

        int[] output = new int[arr1.length + arr2.length];

        // While we have two values left to compare...
        // * Copy the smaller value into the output array
        // * Increment the appropriate indexes
        while (idx1 < arr1.length && idx2 < arr2.length)
        {
            if (arr2[idx2] < arr1[idx1]) {
                output[outputIdx] = arr2[idx2];
                idx2++;
            }
            else {
                output[outputIdx] = arr1[idx1];
                idx1++;
            }
            outputIdx++;
        }

        // Copy rest of array A if array arr2 finished first
        while (idx1 < arr1.length) {
            output[outputIdx] = arr1[idx1];
            idx1++;
            outputIdx++;
        }

        // Copy rest of array arr2 if array A finished first
        while (idx2 < arr2.length) {
            output[outputIdx] = arr2[idx2];
            idx2++;
            outputIdx++;
        }

        return output;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
