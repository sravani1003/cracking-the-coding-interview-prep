package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PermutationsWithDup {
    public ArrayList<String> getPermutations(String str){
        ArrayList<String> result = new ArrayList<>();
        Map<Character, Integer> characterCount = frequencTable(str);
        getPermutations(characterCount, "", str.length(), result);
        return result;
    }

    Map<Character, Integer> frequencTable(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(Character c : str.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }
        return map;
    }

    public void getPermutations(Map<Character, Integer> map, String prefix, int stringCount, ArrayList<String> result){
        if(stringCount == 0){
            result.add(prefix);
            return;
        }

        for(Character c : map.keySet()){
            int count = map.get(c);
            if(count > 0){
                map.put(c , count - 1);
                getPermutations(map, prefix + c, stringCount - 1, result);
                map.put(c, count);
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabbc";
        PermutationsWithDup obj = new PermutationsWithDup();
        ArrayList<String> finalList = obj.getPermutations(str);
        for(String s : finalList){
            System.out.print(s + " ");
        }
    }

}
