package DynamicProgramming;

public class CoinChange {

    public int waysToMakeChange(int number,int[] coins){
        int result = 0;
        int[][] ways = new int[coins.length][number + 1];
        for(int i = 1; i < number; i++){
            ways[0][i] = 0;
        }

        for( int i = 0; i < coins.length; i++){
            ways[i][0] = 1;
        }

        for(int row = 1; row < coins.length; row++){
            for(int column = 1; column < ways.length; column++){
                ways[row][column] = ways[row - 1][column] + ways[row][column - coins[row - 1]];
            }
        }

        for(int i = 0; i < coins.length; i++){
            result += ways[i][number];
        }

        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        int[] coins = {1,2,5};
        CoinChange obj = new CoinChange();
        System.out.println(obj.waysToMakeChange(number, coins));
    }
}
