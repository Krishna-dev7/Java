package A_Basics.Variables;
import java.util.Scanner;
public class myName {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("My name is " + name);
    }
}
