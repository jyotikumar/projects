package sort;

import static utility.Util.swap;

public class BubbleSort implements Sort {
    @Override
    public void sort(int[] arr, int start, int end) {
        for (int i = 0; i < arr.length - i; i++) { //After each pass, the last element is sorted
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // An optimized version of Bubble Sort
    public void sort(int arr[]) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            // IF no two elements were swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }
}
