package practice;

import java.util.HashMap;
import java.util.Map;

public class VowelReversal {

    private static Map<Character, Integer> map;

    private static String reverseVowels(String input) throws Exception {
        char[] chars = input.toCharArray();
        int i = 0;
        int j = chars.length-1;
        if(input.isEmpty()){
            throw new Exception("not valid");
        }
        if(input.length()==1){
            return String.valueOf(chars[i]);
        }
        while(i<=j){
            if(!isVowel(chars[i])) {
                i++;
            }
            else if(!isVowel(chars[j])){
                j--;
            }
            else {
                swap(chars, i, j);
                i++;
                j--;
            }
        }
        return String.valueOf(chars);
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    private static boolean isVowel(char aChar) {
        Map<Character, Integer> characterIntegerMap = buildVowelMap();
        return characterIntegerMap.containsKey(aChar);
    }

    private static Map<Character, Integer> buildVowelMap() {
        map = new HashMap<>();
        map.put('a', 1);
        map.put('e', 2);
        map.put('i', 3);
        map.put('o', 4);
        map.put('u', 5);
        return map;
    }

    public static void main(String[] args) throws Exception {
        String test1 = "someone is idiot";
        String result = reverseVowels(test1);
        System.out.println(result);
    }
}
