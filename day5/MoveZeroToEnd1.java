package day5;

import java.util.Arrays;

public class MoveZeroToEnd1 {
    public static void main(String args[]){
        int a[]={1,5,0,2,0,8,4,0};
        int[] result = moveZeroToEnd(a);
        System.out.println(Arrays.toString(result));
    }

public static int[] moveZeroToEnd(int a[])
{
    int left =0;
    for(int right =0; right<a.length; right++){
        if(a[right]!=0){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
        }
    }
    return a;
}
}