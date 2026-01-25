import java.security.interfaces.RSAKey;
import java.util.Arrays;

public class BInarySearchMAtrix {
    public static void main(String[] args) {
int[][] arr ={
            {1,2,3},
            {5,6,7},
            {11,12,45}
        };
        System.out.println(Arrays.toString(search(arr,6)));
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) return new int[]{row, mid};
            else if (matrix[row][mid] < target) cStart = mid + 1;
            else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};

    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; //be cautious matrix may be empty to have to check for that if it is empty
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        //Run the loop till 2 rows remianing
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        while (rStart < (rEnd - 1)) { //while this true it havig more than two rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) return new int[]{mid, cMid};
            else if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
//        after this loops now we have 2 rows
        //NOw check whether target is present in col of 2 rows;
        if (matrix[rStart][cMid] == target) return new int[]{rStart, cMid};
        else if (matrix[rStart + 1][cMid] == target) return new int[]{rStart + 1, cMid};

        //other wise search in 1st ,2nd ,3rd and 4th half array parts
        //SEarching in 1st part of array of 2 rows remaining matrix
        if (target <= matrix[rStart][cMid - 1]) {
        return binarySearch(matrix,rStart,0,cMid-1,target);
        }

        //SEarching in 2nd part of array of 2 rows remaining matrix
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols-1]) {
            return binarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        //SEarching in 3rd part of array of 2 rows remaining matrix
        if (target <= matrix[rStart+1][cMid -1]) {
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        //SEarching in 4th part of array of 2 rows remaining matrix
        else{
            return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
        }
    }
}
