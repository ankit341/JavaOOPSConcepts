package ArrayProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoNumbersAddUpToN {
    public static int[] findSum(int[] arr, int n)
    {
        int[] result = new int[2];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            j = 0;
            while(j < arr.length ){
                if(arr[i] + arr[j] == n){
                    result[0] = arr[i];
                    result[1] = arr[j];
                }
                j++;
            }
        }
        return result;
    }

    public static int[] findSumUsingSet(int[] arr,int n){
        return new int[10];
    }

    public static void main(String[] args) {
        int[] arrayArgument = new int[]{1,21,3,5,14,6,60};
        System.out.println(Arrays.toString(findSum(arrayArgument,27)));
    }
}
