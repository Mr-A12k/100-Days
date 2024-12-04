package day5;

import java.util.Scanner;

public class SecondLargest {
    public static int getSecondLargest(int []arr){
        int firstLargest =-1;
        int secondLargest =-1;

    for(int num : arr){
        if(num>firstLargest){
            secondLargest = firstLargest;
            firstLargest = num;
        }
        else if(num > secondLargest && num < firstLargest){
            num = secondLargest;
        }
    }
        return secondLargest;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of elemenents in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array Elements:");
        for(int i=0; i<n; i++)
        {
             arr[i] = sc.nextInt();
        }
        int a = getSecondLargest(arr);
        System.out.println("The second Largest element in the array is");
        System.out.println(a);
    }
}
//completed