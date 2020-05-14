package DynamicProgramming;

public class TripleStep {
    public int countPaths(int steps){
        int[] waysTillStep = new int[steps + 1];
        return storeCount(steps, waysTillStep);
    }

    public int storeCount(int steps, int[] waysToStep){
        if(steps < 0){
            return 0;
        }
        else if(steps == 0 || steps == 1){
            return 1;
        }
        else if(waysToStep[steps] > 1){
            return  waysToStep[steps];
        }
        else{
            waysToStep[steps] = countPaths(steps - 1) + countPaths(steps - 2) + countPaths(steps - 3);
            return waysToStep[steps];
        }
    }

    public static void main(String[] args) {
        int step = 3;
        TripleStep obj = new TripleStep();
        System.out.println(obj.countPaths(step));
    }
}
