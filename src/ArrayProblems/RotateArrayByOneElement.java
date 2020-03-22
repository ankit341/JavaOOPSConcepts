package ArrayProblems;

import java.util.Arrays;

public class RotateArrayByOneElement {
    public static void rotateArray(int[] arr){
        int lengthOfArray = arr.length;
        int lastElement = arr[lengthOfArray - 1];
        for (int i = lengthOfArray - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
    }

    public static void main(String[] args) {
        int[] arrayArgument = new int[]{0,1,2,3,4,5,6,7,8,9};
        rotateArray(arrayArgument);
        System.out.println(Arrays.toString(arrayArgument));
    }
}
