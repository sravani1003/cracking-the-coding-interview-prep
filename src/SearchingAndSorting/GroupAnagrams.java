package SearchingAndSorting;

import java.util.*;

public class GroupAnagrams {

    public String[] groupAnagrams(String[] array) {
        Map<String, List<String>> anagramGroupsMap = new HashMap<>();
        for(String str : array){
            String current = sortWord(str);
            if(anagramGroupsMap.containsKey(current)){
                anagramGroupsMap.get(current).add(str);
            }else {
                List<String> words = new ArrayList<>();
                words.add(str);
                anagramGroupsMap.put(current, words);
            }
        }
        int index = 0;
        for(String key : anagramGroupsMap.keySet()){
            List<String> values = anagramGroupsMap.get(key);
            for(String s : values) {
                array[index] = s;
                index++;
            }
        }
        return array;
    }

    public String sortWord(String str) {
        char[] word = str.toCharArray();
        Arrays.sort(word);
        return new String(word);
    }

    public static void main(String[] args) {
        String[] array = {"cat", "dog", "god", "tac", "act"};
        GroupAnagrams obj = new GroupAnagrams();
        obj.groupAnagrams(array);
        for(String s : array){
            System.out.print( s + " ");
        }
        System.out.println();
    }

}
