package CollegeAssignment.Solution;
import java.util.*;

public class packages {
    public static void main(String[] args){
        Trial t = new Trial();
        System.out.println(t.protectedMember);
        System.out.println(t.publicMember);
        System.out.println(t.defaultMember);
        // System.out.println(t.privateMember); // unable to access their value
    }
}

class Trial{
    protected int protectedMember;
    public int publicMember;
    int defaultMember;
    private int privateMember;
    Trial(){
        protectedMember = 10;
        publicMember = 20;
        defaultMember = 30;
        privateMember = 40;
    }
    void p(int val){
        System.out.println(val);
    }
}