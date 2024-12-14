package day6;

//import java.util.*;

public class Patterns {
    public static void main(String args[]){
        StarPyramidPattern(5);
        InverseStarPyramid(5);
        DiamondPattern(5);
    }
        
    //To print pyramid 
    public static void StarPyramidPattern(int n){
        int i,j,k;
        for ( i=0; i<n; i++){
            for( j=n-i-1; j>=1; j--){
                System.out.print(" ");
            } 
            for ( k = 0; k <=i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // To print inverse pyramid
    public static void InverseStarPyramid(int n){
        int i,j,k;
        for (i=0; i<n; i++){
            for(k=0; k<=i-1; k++){
                System.out.print(" ");
            }
            for(j=0; j<=n-i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // To print diamond patten
    public static void DiamondPattern(int n){
        int i,j,k;
        for(i=0; i<n; i++){
            for(j=n-i-1; j>=1; j--){
                System.out.print(" ");
            }
            for(k=0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=0; i<n; i++){
            for(j=0; j<=i; j++){
                System.out.print(" ");
            }
            for(k=n-i-1; k>=1; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}