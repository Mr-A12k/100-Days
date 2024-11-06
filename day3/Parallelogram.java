// the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

// Input Format

// There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

// Constraints

// Output Format

// If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.




import java.io.*;
import java.util.*;

public class  Parallelogram{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();
        
        if((B>0 && B<=100) && (H>0 && H<=100)){
               int area = B*H;
        System.out.println(area);
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}