package DynamicProgramming;

import java.util.ArrayList;

public class PowerSet {

    ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index){
        ArrayList<ArrayList<Integer>> allsubsets;
        if(set.size() == index){
            allsubsets = new ArrayList<ArrayList<Integer>>();
            allsubsets.add(new ArrayList<>());
        }
        else{
            allsubsets = getSubsets(set, index + 1);
            int item = set.get(index);
            ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
            for(ArrayList<Integer> subset : allsubsets) {
                ArrayList<Integer> newSubset = new ArrayList<>();
                newSubset.addAll(subset);
                newSubset.add(item);
                moreSubsets.add(newSubset);
            }
            allsubsets.addAll(moreSubsets);
        }
        return allsubsets;
    }

}
