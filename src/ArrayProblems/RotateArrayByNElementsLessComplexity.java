package ArrayProblems;

import java.util.Arrays;

public class RotateArrayByNElementsLessComplexity {
    public static void rotateArray(int[] arr, int resultantRotation){
        int lengthOfArray = arr.length;
        for (int i = lengthOfArray -1; i >= 0; i--) {
            if(i >= resultantRotation) {
                int temp = arr[i];
                arr[i] = arr[i - resultantRotation];
                arr[i - resultantRotation] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arrayArgument = new int[]{0,1,2,3,4,5,6,7,8,9};
        int degreeOfRotation = 1566666;
        int resultantRotation = degreeOfRotation % arrayArgument.length;
        rotateArray(arrayArgument, resultantRotation);
        System.out.println(Arrays.toString(arrayArgument));
    }
}
