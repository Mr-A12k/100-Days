package day4;

import java.util.*;
//import java.security.*;
public class StringConversion {
 public static void main(String[] args) {

  //DoNotTerminate.forbidExit();


   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
    String s = "";
    if(n>=-100 && n<=100){
        s=Integer.toString(n);
    }
    else{
        return ;
    }
   
   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
}
}

// //The following class will prevent you from terminating the code using exit(0)!
// class DoNotTerminate {

//  public static class ExitTrappedException extends SecurityException {

//   private static final long serialVersionUID = 1;
//  }

//  public static void forbidExit() {
//   final SecurityManager securityManager = new SecurityManager() {
//    @Override
//    public void checkPermission(Permission permission) {
//     if (permission.getName().contains("exitVM")) {
//      throw new ExitTrappedException();
//     }
//    }
//   };
//   System.setSecurityManager(securityManager);
//  }
// }


// You are given an integer , you have to convert it into a string.

// Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".

//  can range between  to  inclusive.