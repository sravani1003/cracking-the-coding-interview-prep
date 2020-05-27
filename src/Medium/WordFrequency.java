package Medium;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public int getWordFrequency(String[] book, String str){
        Map<String, Integer> map = new HashMap<>();
        for(String s : book){
            s = s.trim().toLowerCase();
            if(!map.containsKey(s)){
                map.put(s, 1);
            }
            else{
                map.put(s, map.get(s) + 1);
            }
        }
        return map.get(str);
    }

    public static void main(String[] args) {
        String[] book = {"hello","everyone","welcome","to","java  ","Java","JAVA"};
        String str = "java";
        WordFrequency obj = new WordFrequency();
        System.out.println(obj.getWordFrequency(book, str));
    }
}
