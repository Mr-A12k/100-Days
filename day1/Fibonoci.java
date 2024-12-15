import java.util.*;

public class Fibonoci {
    public static void main(String[] args) {
        int a = 0;
        int b=1;
        int temp ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n value to find the fobonacci series:");
        int n= scanner.nextInt();

        if(n==0||n==1){
            System.out.println("n value must be greater than 0");
        }
        else{
            for(int i=2;i<=n;i++){
                temp = b;
                b=a+b;
                a=temp;
                System.out.println(b);
                // a++;

            }
        }
    }
}
