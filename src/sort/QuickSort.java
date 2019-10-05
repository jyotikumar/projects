package sort;

public class QuickSort {

    static void quickSort(int[] arr, int start, int end) {
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
        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1, end);
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {4,23,22,4,1,3,34,22};
        printArray(arr);
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
