package practice;

import java.util.Arrays;

import static practice.Heap.*;

public class MedianInIntegerStream {

    int[] minHeap;
    int[] maxHeap;

    public double[] getMedians(int[] arr){

        minHeap = new int[0];
        maxHeap = new int[0];

        double[] medians = new double[arr.length];

        for(int i = 0; i < arr.length; i++){
            int number = arr[i];
            addNumber(number, minHeap, maxHeap);
            rebalance(minHeap, maxHeap);
            medians[i] = findMedian(minHeap, maxHeap);
        }

        return medians;
    }

    private void rebalance(int[] minHeap, int[] maxHeap) {
        int bigheap = maxHeap.length>minHeap.length?maxHeap.length:minHeap.length;
        int smallheap = maxHeap.length>minHeap.length?minHeap.length:maxHeap.length;
        if(bigheap-smallheap>=2){
            int number = maxHeap[0];
            removeTopAndHeapify(maxHeap);
            addInMinHeapToRebalanceAndHeapify(minHeap, number);
        }
    }

    private void addInMinHeapToRebalanceAndHeapify(int[] minHeap, int number) {
        int[] arr = add(minHeap, number);
        int[] tmp = minHeap(arr);
        minHeap = Arrays.copyOf(minHeap, tmp.length);
        copyArrData(minHeap, tmp);
        this.minHeap = minHeap;
    }

    private void removeTopAndHeapify(int[] maxHeap) {
        int[] tmpMax = removeTop(maxHeap);
        maxHeap = Arrays.copyOf(maxHeap, tmpMax.length);
        copyArrData(maxHeap, tmpMax);
        maxHeap = Heap.maxHeap(maxHeap);
        this.maxHeap=maxHeap;
    }

    private void copyArrData(int[] heapArr, int[] tmpArr) {
        for (int i = 0; i < tmpArr.length; i++) {
            heapArr[i] = tmpArr[i];
        }
    }

    private double findMedian(int[] minHeap, int[] maxHeap) {
        int bigheap = maxHeap.length>minHeap.length?maxHeap.length:minHeap.length;
        int smallheap = maxHeap.length>minHeap.length?minHeap.length:maxHeap.length;
        if(bigheap==smallheap){
            return ((double) (minHeap[0]+maxHeap[0])/2);
        }
        else {
            return maxHeap[0];
        }
    }

    private void addNumber(int number, int[] minHeap, int[] maxHeap) {
        if(maxHeap.length==0 || number < maxHeap[0]){
            int[] arr = add(maxHeap, number);
            int[] tmp = Heap.maxHeap(arr);
            maxHeap = Arrays.copyOf(maxHeap, tmp.length);
            copyArrData(maxHeap, tmp);
            this.maxHeap = maxHeap;
        }else {
            addInMinHeapToRebalanceAndHeapify(minHeap, number);
        }
    }

    public static void main(String[] args) {
        MedianInIntegerStream median = new MedianInIntegerStream();
        int[] arr = {5,15,1,3};
        double[] medians = median.getMedians(arr);
        for(double i: medians){
            System.out.print(i+", ");
        }
    }
}
