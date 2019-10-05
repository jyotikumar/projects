package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ImmediateSmallerElement {

    public static void getResult(int size, int[] arr) {
        for (int i = 1; i < size; i++) {
            if (arr[i] >= arr[i - 1]) {
                arr[i - 1] = -1;
            } else {
                arr[i - 1] = arr[i];
            }
        }
        arr[size - 1] = -1;

    }

    public static void main(String[] args) throws IOException {

        //using scanner will take double time than StringBuffer
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // taking input of number of testcase
        int testCases = Integer.parseInt(br.readLine());
        while (testCases-- > 0) {
            int n = Integer.parseInt(br.readLine());

            // Declaring array
            int arr[] = new int[n];
            String line = br.readLine();
            String[] strs = line.trim().split("\\s+");

            // array elements input
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(strs[j]);
            }
            getResult(n, arr);
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < n; i++)
                sb.append(arr[i] + " ");

            // finally printing the string
            System.out.println(sb);

        }
    }

}

