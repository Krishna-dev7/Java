package A_Basics.Problems;
import java.util.Scanner;
public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the values: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        float average = (float) (a+b+c) / 3;
        System.out.println(average);
    }
}