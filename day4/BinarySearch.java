package day4;
import java.util.*;

public class BinarySearch {
    public static int BinaryAlgorithm(int arr[], int target) {
        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            int mid = first + (last - first) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (arr[mid] > target) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i =0; i<n ; i++){
             arr[i] = sc.nextInt();
        }
        
        int a = BinaryAlgorithm(arr, n);
        System.out.println("The mid element is:");
        System.out.println(a);
    }
}