package CollegeAssignment.Solution;
import java.util.*;

public class Solution6 {
    public static void main(String[] args){
        String str = "We are the Full Stack Java Developer";
        // print the length
        System.out.println(str.length());

        // print the first character of each words in string
        String[] strArr = str.trim().split(" ");
        for(String word:strArr){
            System.out.print(word.charAt(0) + " ");
        }
        System.out.println();

        // print total number of white spaces in a string
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println("The total number of spaces in a string : " + count);

        // first word of the string
        System.out.println("The first word of the string : " + strArr[0]);
    }
}