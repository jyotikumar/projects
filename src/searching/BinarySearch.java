package searching;

public class BinarySearch implements Search {
    @Override
    public boolean search(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        return binarySearch(arr, start, end, value);
    }

    private boolean binarySearch(int[] arr, int start, int end, int value) {
        if (end >= start) {
            int middle = (start + end) / 2;
            if (arr[middle] == value) {
                return true;
            }
            if (value < arr[middle]) {
                return binarySearch(arr, start, middle - 1, value);
            }
            return binarySearch(arr, middle + 1, end, value);
        }
        return false;
    }
}
