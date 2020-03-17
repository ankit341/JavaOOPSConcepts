package ArrayProblems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
        int[] result = new int[2];
        Set<Integer> set = new HashSet<Integer>(10);
        for (int i : arr){
            if (set.contains(n - i)){
                result[0] = i;
                result[1] = n-i;
                break;
            }
            set.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 15;
        int[] arrayArgument = new int[]{1,21,3,5,14,6,60};
        System.out.println("My value" + arrayArgument[-1]);
        int[] result = findSumUsingSet(arrayArgument,n);
        if(arrayArgument.length > 0){
            if ( result[0] + result[1] != n)
                System.out.println("Not found");
            else
                System.out.println("Numbers are " + result[0] + "and " + result[1] + "summing upto" + n);
        } else
            System.out.println("Array is empty");
    }
}
