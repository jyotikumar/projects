package sorting;

import static utility.Util.swap;

public class HeapSort {

    public static void heapSort(int[] arr){
        int n = arr.length;
        for(int i = n/2-1; i >= 0 ; i--){
            heapify(arr, i, n);
        }
        for(int j = n-1; j>=0 ; j--){
            swap(arr, 0, j);
            heapify(arr, 0, j);
        }

    }

    private static void heapify(int[] arr, int i, int n) {

        int largest = i, l = 2*i+1, r = 2*i+2;
        if(l<n && arr[l] > arr[largest]){largest = l;}
        if(r<n && arr[r] > arr[largest]){largest = r;}
        if(largest != i){
            swap(arr, largest, i);
            heapify(arr, largest, n);
        }
    }
}
