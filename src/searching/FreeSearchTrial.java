package searching;

import sorting.QuickSort;
import sorting.Sort;

public class FreeSearchTrial {

    public static void main(String[] args) {
        int[] arr = {22,34,12,4,7,90,33,44};
        Search binarySearch = new BinarySearch();
        Search linearSearch = new LinearSearch();

        boolean found = linearSearch.search(arr, 12);

        if(found){
            System.out.println("EUREKA");
        }

        Sort quickSort = new QuickSort();
        quickSort.sort(arr, 0, arr.length-1);

        boolean gotIt = binarySearch.search(arr, 12);

        if(gotIt){
            System.out.println("EUREKAAA");
        }

    }
}
