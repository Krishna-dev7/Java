package CollegeAssignment.Solution;

import java.util.*;

public class Solution1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // using enhanced for loop
        for(String val:args){
            System.out.print(val + " ");
        }
        sc.close();
    }
}