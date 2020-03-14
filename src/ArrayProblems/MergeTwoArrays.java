package ArrayProblems;

import java.util.Arrays;

public class MergeTwoArrays {
    public static int[] mergeArrays(int[] arr1, int[] arr2)
    {
        int[] resultantArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j <arr2.length; j++){
                if (arr1[i] < arr2[j])
                    resultantArray[i+j] = arr1[i];
                else
                    resultantArray[i+j] = arr2[j];
            }
        }
        return resultantArray;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1,3,5,7,9};
        int[] array2 = new int[]{2,4,6,8,10};
        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(mergeArrays(array1,array2)));
    }
}
