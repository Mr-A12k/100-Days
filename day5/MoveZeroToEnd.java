package day5;

import java.util.*;

class MoveZeroToEnd{
    public static void main(String args[]){
        int[] a= {1,5,0,5,2,0,8};
        System.out.println();
        int arr[] = moveZeroToEnd(a);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] moveZeroToEnd(int a[]){
        int count=0;
        for(int i=0; i<a.length; i++){
            if(a[i]!=0){
                a[count++]=a[i];
            }
        }
        while(count<a.length){
            a[count++]=0;
        }
        return a;
    }
}