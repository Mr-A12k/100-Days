import java.io.*;

class PascalTriangle{
    public static void printPascalTrinagle(int rows){
        for (int i=0;i<rows;i++){
            
            int num=1;
            for (int j=0;j<rows-i-1;j++){
                
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                
                System.out.print(num + " ");
                
                num=num*(i-k)/(k+1);
            }
            System.out.println();
    }
	
}

public static void main(String args[]){
    int rows=5;
    printPascalTrinagle(rows);
}
}