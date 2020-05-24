package SearchingAndSorting;

import Searching.LinearSearch;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public int longestSubstring(String str){
        char[] array = str.toCharArray();
        Set<Character> set = new HashSet<>();
        int max_length = 0;
        int i = 0, j = 0;
        while(j < array.length - 1){
            if(!set.contains(array[j])){
                set.add(array[j]);
            }
            else{
                max_length = Math.max(max_length, j - i);
                while(array[i] != array[j]){
                    i++;
                }
                set.add(array[j]);
                i++;
            }
            j++;
            for(int a = i; a < j; a++){
                System.out.print(array[a] + " ");
            }
            System.out.println();
        }
        max_length = Math.max(max_length, j - i + 1);
        return max_length;
    }

    public static void main(String[] args) {
//        String str = "abcdbshkegosaqbcd";
//        String str = "abcdbzxy123";
//        String str = "ebwgebnprthdjhabsdbnsn";
        String str = "dcbaabcd";

        LongestSubstring obj = new LongestSubstring();
        System.out.println(obj.longestSubstring(str));
    }
}
