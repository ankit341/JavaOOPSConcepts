package ArrayProblems;

import java.util.Arrays;

public class RearrangePositiveAndNegativeValues {
    public static void rearrange(int[] arr){
        int arrayLength = arr.length;
        int indexVariable = 0;

        for (int i = 0; i < arrayLength; i++){
            if(arr[i] < 0){
                int temp = arr[indexVariable];
                arr[indexVariable] = arr[i];
                arr[i] = temp;
                indexVariable++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arrayArgument = new int[]{-1,4,3,-2,-5,6};
        rearrange(arrayArgument);
        System.out.println(Arrays.toString(arrayArgument));
    }
}
