package CollegeAssignment.Solution;
import java.util.*;

public class Solution3 {
    public static StringBuilder sortAlphabetically(String word){
        int len = word.length();
        int[] map = new int[150];
        for(int i=0; i<len; i++){
            map[word.charAt(i)]++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<map.length; i++){
            while(map[i] > 0){
                char c = (char) i;
                sb.append(c);
                map[i]--;
            }
        }

        for(int i=0; i<len-1; i++){
            for(int j=i+1; j<len; j++){
                if(sb.charAt(i) == sb.charAt(j) - 32){
                    sb.insert(i+1, sb.charAt(j));
                    sb.deleteCharAt(j+1);
                    i++;
                    break;
                } else if(sb.charAt(i) == sb.charAt(j)){
                    break;
                }
            }
        }
        return sb;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        System.out.println(sortAlphabetically(word));

        sc.close();
    }
}