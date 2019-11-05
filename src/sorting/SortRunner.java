package sorting;

import static utility.Util.printArray;

public class SortRunner {

    public static void main(String[] args) {
        int[] arr = {16, 5, 20, 8, 2, 28, 1};
        printArray(arr);
        Sort quickSort = new QuickSort();
        Sort selectionSort = new SelectionSort();
        Sort bubbleSort = new BubbleSort();
        Sort insertionSort = new InsertionSort();
        Sort mergeSort = new MergeSort();

//        quickSort.sorting(arr, 0, arr.length-1);
//        selectionSort.sorting(arr, 0, arr.length - 1);
//        bubbleSort.sorting(arr, 0, arr.length - 1);
//        insertionSort.sort(arr, 0, arr.length-1);
//        mergeSort.sort(arr, 0, arr.length-1);
        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(arr);
        printArray(arr);
    }

}
