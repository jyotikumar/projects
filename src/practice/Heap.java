package practice;

import java.util.Arrays;

import static utility.Util.swap;

public class Heap {

    static int[] add(int[] arr, int data){
        int[] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = data;
        return newArr;
    }

    static int[] removeTop(int[] arr){
        int[] newArr = Arrays.copyOf(arr, arr.length - 1);
        for(int i =0; i<arr.length-1; i++){
            newArr[i] = arr[i+1];
        }
        return newArr;
    }

    static int[] maxHeap(int [] arr){
        int n = arr.length;
        for(int i=n/2-1; i>=0; i--){
            maxHeapify(arr, i, n);
        }
        return arr;
    }

    static int[] minHeap(int[] arr){
        int n = arr.length;
        for(int i=n/2-1; i>=0; i--){
            minHeapify(arr, i, n);
        }
        return arr;
    }

    private static void minHeapify(int[] arr, int i, int n) {
        int l=2*i+1, r=2*i+2,smallest=i;
        if(l<n && arr[l]<arr[smallest]){
            smallest=l;
        }
        if(r<n && arr[r]<arr[smallest]){
            smallest=r;
        }
        if(i!=smallest){
            swap(arr, smallest, i);
            minHeapify(arr, smallest, n);
        }
    }

    private static void maxHeapify(int[] arr, int i, int n) {
        int l=2*i+1, r=2*i+2,largest=i;
        if(l<n && arr[l]>arr[largest]){
            largest=l;
        }
        if(r<n && arr[r]>arr[largest]){
            largest=r;
        }
        if(i!=largest){
            swap(arr, largest, i);
            maxHeapify(arr, largest, n);
        }
    }

    public static void main(String[] args) {
        int[] arr ={22, 88, 33, 12, 44, 24, 37, 78};
        Heap heap = new Heap();
        heap.minHeap(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        heap.maxHeap(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
