package CollegeAssignment.Solution;
import java.util.*;

public class Solution5{
    public static int[][] subtractMatrices(int[][] mat1, int[][] mat2){
        int len = mat1.length;
        int[][] result = new int[len][len];

        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                result[i][j] = 3*mat1[i][j] - 2*mat2[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args){
        // Two dimensional Array implementation
        int[][] matC = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] matD = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] result = subtractMatrices(matC, matD);
        
        for(int[] i:result){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
