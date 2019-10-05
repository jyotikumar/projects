package sort;

import static utility.Util.swap;

public class SelectionSort implements Sort{

    @Override
    public void sort(int[] arr, int start, int end) {
       for(int k=0; k< arr.length-1; k++) {
           int min_inx=k; //need to keep minimum index to exchange in the end
           for (int i = k+1 ; i < arr.length; i++) {
               if (arr[i] <= arr[min_inx]) { //compare values and then update min index to have lowest value
                   min_inx = i;
               }
           }
           swap(arr, k, min_inx);
       }
    }
}
