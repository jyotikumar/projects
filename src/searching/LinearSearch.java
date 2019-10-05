package searching;

public class LinearSearch implements Search{

    @Override
    public boolean search(int[] arr, int value) {
        for(int i : arr){
            if(value==i) return true;
        }
        return false;
    }
}
