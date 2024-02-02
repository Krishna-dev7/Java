package CollegeAssignment.Solution;
import java.util.*;

public class Solution4 {
    public static void main(String[] args){
        // Explicit narrowing conversion
        int score = 234;

        // int to byte
        int singleByte = (int) score;
        System.out.println(singleByte);

        // int to float
        float avg = (float) score/20;
        System.out.println(avg);

        // float to int
        int intAvg = (int) avg;
        System.out.println(intAvg);

        // float into byte
        singleByte = (byte) avg;
        System.out.println(singleByte);
        
    }
}