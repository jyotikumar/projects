package sorting;

import static utility.Util.printArray;

public class SortRunner {

    public static void main(String[] args) {
        int[] arr = {4, 23, 22, 4, 1, 3, 34, 22};
        printArray(arr);
        Sort quickSort = new QuickSort();
        Sort selectionSort = new SelectionSort();
        Sort bubbleSort = new BubbleSort();
        Sort insertionSort = new InsertionSort();

//        quickSort.sorting(arr, 0, arr.length-1);
//        selectionSort.sorting(arr, 0, arr.length - 1);
//        bubbleSort.sorting(arr, 0, arr.length - 1);
        insertionSort.sort(arr, 0, arr.length-1);
        printArray(arr);
    }

}
