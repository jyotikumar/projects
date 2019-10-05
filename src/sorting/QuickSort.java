package sorting;

import static utility.Util.swap;

public class QuickSort implements Sort{

    @Override
    public void sort(int[] arr, int start, int end) {
        int pivot = start;
        int i = start;

        for (int j = start + 1; j < arr.length; j++) {
            if (arr[j] <= arr[pivot]) {
                i++;
                swap(arr, i, j);
            }
        }
        if (i != pivot) {swap(arr, i, pivot);}
        if(start >= end) return;
        sort(arr, start, pivot-1);
        sort(arr, pivot+1, end);
    }

}
