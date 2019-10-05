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

        int [] res = new int[arr.length];
        int i = start;
        int j= mid+1;

            while(arr[i]<arr[j]){
                arr[i] = arr[i];
                i++;
            }

            while (arr[j]<arr[i]){
                arr[i]=arr[j];
                i++;
                j++;
            }
        if(i<=mid){
            arr[i]=arr[i];
            i++;
        }
        if(j<=end){
            arr[i]=arr[j];
            i++;
        }



    }

}
