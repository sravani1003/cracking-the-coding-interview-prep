package BitManipulation;

public class Insertion {
    public int bitInsertion(int N,int M,int i,int j){
        int allOnes = ~0;
        int left = allOnes << (j+1);
        int right = (1 << i) - 1;
        int mask = left | right;
        int n_cleared = N & mask;
        int m_shifted = M << i;

        return n_cleared | m_shifted;
    }

    public static void main(String[] args) {
        int N = 1024;
        int M = 19;
        int i = 2;
        int j = 6;
        Insertion obj = new Insertion();
        System.out.println(obj.bitInsertion(N, M, i, j));
    }
}
