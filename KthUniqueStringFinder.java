// import java.util.*;
// public class KthUniqueStringFinder{
//     public static String findKthUniqueString(String[] strings,int k){
//         Map<String,Integer> frequencyMap = new LinkedHashMap<>();
//         for(String str:strings){
//             frequencyMap.put(str,frequencyMap.getOrDefault(str, 0)+1);
//         }
//         int count=0;
//         for(Map.Entry<String,Integer>entry:frequencyMap.entrySet()){
//             if(entry.getValue()==1){
//                 count++;
//                 if(count==k){
//                     return entry.getKey();
//                 }
//             }
           
//         }
//         return "";
//     }
// }

// public static void main(String[] args){
//     String[] strings={"apple", "banana", "apple", "orange", "banana", "grape", "mango"};
//     int k=3;
//     String result = findKthUniqueString(strings,k);
//     System.out.println("The " + k + "rd unique string is: " + result);
// }

import java.util.*;
import java.util.Map;
import java.util.LinkedHashMap;


public class KthUniqueStringFinder {
    public static String findKthUniqueString(String[] strings, int k) {
        // Use a LinkedHashMap to preserve the insertion order
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();
        
        // Count the frequency of each string
        for (String str : strings) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }
        
        // Iterate over the map to find the k-th unique string
        int count = 0;
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) { // Only consider unique strings
                count++;
                if (count == k) {
                    return entry.getKey();
                }
            }
        }
        
        // If there are fewer than k unique strings, return an empty string
        return null;
    }

    public static void main(String[] args) {
        // Example usage
        String[] strings = {"apple", "banana", "apple", "orange", "banana", "grape", "mango"};
        int k = 3; // Find the 3rd unique string
        
        String result = findKthUniqueString(strings, k);
        System.out.println("The " + k + "rd unique string is: " + result);
    }
}
