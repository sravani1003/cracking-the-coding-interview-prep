package Arrays;

import java.util.HashMap;
import java.util.Map;

public class ZeroMatrix {
    public static void zeroMatrix(int[][] mat){
        boolean[] row = new boolean[mat.length];
        boolean[] column = new boolean[mat[0].length];
        boolean rowZero = false;
        boolean columnZero = false;
        for(int i = 0;i < row.length;i++){
            if(mat[0][i] == 0){
                rowZero = true;
                break;
            }
        }
        for(int j = 0;j < column.length;j++){
            if(mat[j][0] == 0){
                columnZero = true;
                break;
            }
        }
        for(int a = 1;a < row.length;a++){
            for(int b = 1;b < column.length;b++){
                if(mat[a][b] == 0){
                    mat[a][0] = 0;
                    mat[0][b] = 0;
                }
            }
        }
        for(int i = 0;i < row.length;i++){
            if(mat[i][0] == 0){
                zeroRow(mat, i);
            }
        }
        for(int j = 0;j < column.length;j++){
            if(mat[0][j] == 0){
                zeroColumn(mat, j);
            }
        }
        if(rowZero){
            zeroRow(mat, 0);
        }
        if(columnZero){
            zeroColumn(mat, 0);
        }
        for(int[] i : mat){
            for(int j : i){
                System.out.println(j);
            }
        }
    }
    public static void zeroRow(int[][] matrix, int i){
        for(int x = 0;x < matrix[0].length;x++){
            matrix[i][x] = 0;
        }
    }
    public static void zeroColumn(int[][] matrix, int i){
        for(int x = 0;x < matrix.length;x++){
            matrix[x][i] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,9,4},{6,0,8,9},{0,3,2,9}};
        zeroMatrix(matrix);
    }
}
