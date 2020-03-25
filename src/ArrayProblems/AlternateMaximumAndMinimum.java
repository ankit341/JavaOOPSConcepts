package ArrayProblems;

import java.util.Arrays;

public class AlternateMaximumAndMinimum {
    public static void findAlternateMaxAndMin(int[] arr){
        int length = arr.length;
        int frontPointer = 0, backPointer = length - 1;
        boolean pointerCounter = false;
        int[] intermediateArray = new int[length];

        for (int i = 0; i < length; i++){
            if (!pointerCounter){
                intermediateArray[i] = arr[backPointer];
                backPointer--;
            } else {
                intermediateArray[i] = arr[frontPointer];
                frontPointer++;
            }
            pointerCounter = !pointerCounter;
        }

        for (int j = 0; j < length; j++){
            arr[j] = intermediateArray[j];
        }
    }

    public static void main(String[] args) {
        int[] arrayArgument = new int[]{1,2,3,4,5,6,7,8,9};
        findAlternateMaxAndMin(arrayArgument);
        System.out.println(Arrays.toString(arrayArgument));
    }
}
