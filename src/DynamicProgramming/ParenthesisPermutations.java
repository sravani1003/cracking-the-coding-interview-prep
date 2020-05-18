package DynamicProgramming;

import BitManipulation.PairwiseSwap;

import java.util.ArrayList;

public class ParenthesisPermutations {
        public ArrayList<String> getPermutaions(int setCount){
            ArrayList<String> result = new ArrayList<>();
            char[] str = new char[setCount * 2];
            createString(result, setCount, setCount, str, 0);
            return result;
        }

        public void createString(ArrayList<String> result, int leftCount, int rightCount, char[] str, int count){
            if(leftCount < 0 || rightCount < leftCount){
                return;
            }
            if(leftCount == 0 && rightCount == 0){
                String stringParen = String.copyValueOf(str);
                result.add(stringParen);
            }
            else {
                if(leftCount > 0){
                    str[count] = '(';
                    createString(result, leftCount - 1, rightCount, str, count + 1);
                }
                if(rightCount > 0){
                    str[count] = ')';
                    createString(result, leftCount, rightCount - 1, str, count + 1);
                }
            }
        }

    public static void main(String[] args) {
        int count = 3;
        ParenthesisPermutations obj = new ParenthesisPermutations();
        ArrayList<String> finalList = obj.getPermutaions(count);
        for(String s : finalList){
            System.out.print( s + " " );
        }
    }
}
