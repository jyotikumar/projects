package practice;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//reverse string without affecting the special chars in string

public class StringReversal {

    private void recReverse(String input, String result){
        result = result + input.substring(input.length()-2, input.length()-1);
//        recReverse(input.substring(), "");

    }

    private void reverse(String input){
        char[] in = input.toCharArray();
        String result = "";
        for(int i=in.length-1; i>=0; i--){
            result = result + in[i];
        }
        System.out.println(result);
    }

    private void reverseString(String input) {
        char[] chars = input.toCharArray();
        int length = input.length();
        for(int i=0, j=length-1; i<=j;) {
//            while (ifSpecialChar(chars[i])) i++;
            while(!Character.isAlphabetic(chars[i]))i++;
//            while (ifSpecialChar(chars[j])) j--;
            while(!Character.isAlphabetic(chars[j]))j--;
            swap(chars, i, j);
            i++;j--;
        }
        System.out.println(String.valueOf(chars));
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
    }

    private boolean ifSpecialChar(char aChar) {
        Pattern compile = Pattern.compile("[^a-zA-Z0-9\\s+]");
        Matcher matcher = compile.matcher(String.valueOf(aChar));
        return matcher.find();
    }

    public static void main(String[] args) throws IOException {

        StringReversal stringReversal = new StringReversal();
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        for (int i = 0; i < input; i++) {
            String inputString = reader.readLine();
            reverseString(inputString);
        }*/
//        String inputString="(x$l$`ek]$intly$l$ysbzatm";
//        stringReversal.reverseString(inputString);
        String input = "geeksforgeeks";
        stringReversal.reverse(input);
    }
}
