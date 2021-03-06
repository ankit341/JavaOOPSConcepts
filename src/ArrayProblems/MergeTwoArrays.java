package ArrayProblems;

import java.util.Arrays;

public class MergeTwoArrays {
    public static int[] mergeArrays(int[] arr1, int[] arr2)
    {
        int[] resultantArray = new int[arr1.length + arr2.length];
        int i = 0 ,j = 0 ,k = 0;
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j])
                resultantArray[k++] = arr1[i++];
            else
                resultantArray[k++] = arr2[j++];

        }
        while (i < arr1.length){
            resultantArray[k++] = arr1[i++];
        }
        while(j < arr2.length){
            resultantArray[k++] = arr2[j++];
        }
        return resultantArray;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{12,32,52,72,92};
        int[] array2 = new int[]{2,4,6,8,10};
        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(mergeArrays(array1,array2)));
    }
}

//One try to solve this question using for loop
/*        for (int i = 0; i < arr1.length; i++){
            int minimumNumber = 0;
            minimumNumber = arr1[i];
            for (int j = 0; j < arr2.length; j++){
                if (minimumNumber > arr2[j]){
                    minimumNumber = arr2[j];
                }
            }
            resultantArray[i] = minimumNumber;
        }*/
