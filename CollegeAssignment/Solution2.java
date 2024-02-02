package CollegeAssignment.Solution;
import java.util.*;

public class Solution2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int phy = sc.nextInt();
        int maths = sc.nextInt();
        int chem = sc.nextInt();
        Student s1 = new Student(phy, maths, chem);
        s1.gradeCalculator();
        s1.getResult();
    }
}

/**
 * @author : Krishna
 * Student class contains siz properties 
 * they are phy, maths, chem, total, per and Grade
 * Student() constructor takes
 * @param phy
 * @param maths
 * @param chemistry
 */

class Student {
    int phy;
    int maths;
    int chem;
    int total;
    float per;
    char Grade;

    Student(int phy, int maths, int chemistry){
        this.phy = phy;
        this.maths = maths;
        this.chem = chemistry;
        calculateTotal();
        // gradeCalculator();
    };

    // calculate grade
    /**
     * gradeCalculator(per)
     * @param int per
     * @return void
     */
    void gradeCalculator(){
        int range = (int) per/10;
        Grade = switch(range){
            case 9: yield 'O';
            case 8: yield 'A';
            case 7: yield 'B';
            case 6: yield 'C';
            case 5: yield 'D';
            default: yield '.';
        };
    };

    // to get grade
    /**
     * getGrade()
     * @return char Grade
     */
    char getGrade(){
        return Grade;
    };

    void calculateTotal(){
        total = phy + chem + maths;
        per = (float) total/3;
    };

    void getResult(){
        System.out.println("Total marks : " + total);
        System.out.println("Percentage : " + per);
        System.out.println("Grade : " +  Grade);
    };

};