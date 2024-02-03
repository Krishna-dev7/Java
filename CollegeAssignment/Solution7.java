package CollegeAssignment;
import java.util.*;

class MyThread extends Thread{

    String[] Names;
    MyThread(String[] names){
        this.Names = names;
    }

    // overrides the run method
    public void run(){
        try {
            for(String val:Names){
                System.out.println(val);
                Thread.sleep(5000);
            }
        } catch(InterruptedException e){
            System.out.println("myThread interrupted");
        }

    }
}



public class Solution7 {
//    // using quick sort
//    static void sortNames(String[] names, int start, int end){
//        //base case
//        if(names.length <= 1){
//            return;
//        }
//
//        //recursion
//        // call partition function
//        int pivotPoint = partition(names, start, end, end);
//
//        // call quick sort for left and right respectively
//        sortNames(names, start, pivotPoint);
//        sortNames(names, pivotPoint+1, end);
//        //return statement
//    }
//
//    static int partition(String[] names, int start, int end, int pivot){
//        int i = start-1;
//        int j = start;
//        while(j<=end){
//            if(names[j].compareTo(names[pivot]) <= 0){
//                i++;
//                String temp = names[i];
//                names[i] = names[j];
//                names[j] = temp;
//            }
//            j++;
//        }
//
//        i++;
//        names[i] = names[pivot];
//        return i;
//    }
//

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        for(int i=0; i<names.length; i++){
            names[i] = sc.next();
        }

//        sortNames(names, 0, names.length-1);
        Arrays.sort(names);

        // create instance of mythread
        MyThread thread = new MyThread(names);
        thread.start();
        sc.close();
    }
}