package DynamicProgramming;

import BitManipulation.PairwiseSwap;

import java.util.ArrayList;

public class PermutationsWithoutDup {

    public ArrayList<String> getPermutations(String str){
        ArrayList<String> result = new ArrayList<>();
        if(str.length() == 0){
            result.add("");
            return result;
        }

        for(int i = 0; i < str.length(); i++){
            String firstPart = str.substring(0, i);
            String lastPart = str.substring(i+1);
            ArrayList<String> temp = getPermutations(firstPart + lastPart);

            for(String part : temp){
                result.add(str.charAt(i) + part);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "ajdc";
        PermutationsWithoutDup obj = new PermutationsWithoutDup();
        ArrayList<String> finalList = obj.getPermutations(str);
        for(String string : finalList){
            System.out.print(string + " ");
        }
    }
}
