import java.lang.reflect.Array;
import java.util.Arrays;

public class MatrixBinarySearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,  2,  3,  7},
                {11, 12, 16, 17},
                {18, 21, 25, 28},
                {30, 32, 34, 36}
        };
        System.out.println(Arrays.toString(search(matrix,16)));
    }

    static int[] search (int matrix[][], int target){
        int r=0;
        int c=matrix.length -1;
        while(r< matrix.length && c>=0){
            if(matrix[r][c]==target)return new int[]{r,c};
            else if (matrix[r][c]<target) r++;
            else if (matrix[r][c]>target) c--;


            }
        return new int[]{-1,-1};
        }
    }

