// Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

// A byte is an 8-bit signed integer.
// A short is a 16-bit signed integer.
// An int is a 32-bit signed integer.
// A long is a 64-bit signed integer.
// Given an input integer, you must determine which primitive data types are capable of properly storing that input.

// To get you started, a portion of the solution is provided for you in the editor.

import java.util.*;



class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
                long   x=0;
            try
            {
                 x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                
                if(x>=-128 && x<=127)System.out.println("* byte");
                   
                if(x>=-32768 && x<=32767){
                    System.out.println("* short");
                }
                if(x>= -2147483648 && x<=2147483647){
                    System.out.println("* int");
                }
                
                if(x>=-9223372036854775808L && x<=9223372036854775807L){
                    System.out.println("* long");
                }
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
