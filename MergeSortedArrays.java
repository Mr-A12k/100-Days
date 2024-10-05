import java.util.Arrays;

class MergeSortedArrays {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 2, 4, 6 };
        int[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}
