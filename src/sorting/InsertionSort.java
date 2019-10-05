package sorting;

import static utility.Util.swap;

public class InsertionSort implements Sort {
    @Override
    public void sort(int[] arr, int start, int end) {

        for (int k = 0; k < arr.length - 1; k++) {
            //pick next element and insert it to its sorted position in previous array [0...current]
            for (int i = k + 1; i > 0; i--) { //checking from current position to all previous
                if (arr[i] <= arr[i - 1]) {
                    swap(arr, i, i - 1);
                }
            }
        }
    }
}
