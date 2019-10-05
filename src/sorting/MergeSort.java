package sorting;

public class MergeSort implements Sort{

    @Override
    public void sort(int[] arr, int start, int end) {

        if(start<end) {
            int mid = (start + end) / 2;

            sort(arr, start, mid);
            sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }
    //TODO - need to fix merge method
    private static void merge(int[] arr, int start, int mid, int end ){

        int[] temp = new int[end-start+1];
        int k=0;
        int p = start;
        int q = mid+1;

        for(int i=start; i<=end; i++){
            if(p>mid)temp[k++]=arr[q++]; //if first arr ends
            else if(q>end) temp[k++]=arr[p++]; //if 2nd array ends

            else if(arr[p]<arr[q]){
                temp[k++] = arr[p++];
            }
            else{
                temp[k++] = arr[q++];
            }
        }

        for (int i=0; i<k; i++) {
            arr[start++] = temp[i];
        }
    }
}
