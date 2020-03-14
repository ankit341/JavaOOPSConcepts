package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckRemoveEven1 {
    public static int[] removeEven(int[] arr) {
        int noOfOddNumbers = 0;
        int flagEven = 0;

        for (int i = 0; i < arr.length ; i++){
            if (arr[i] % 2 != 0)
                noOfOddNumbers++;
        }
        int resultantArray[] = new int[noOfOddNumbers];

        for(int j = 0; j <arr.length; j++){
            if (arr[j] % 2 != 0){
                for (int k = flagEven ; k < noOfOddNumbers; k++){
                    resultantArray[k] = arr[j];
                }
                flagEven++;
            }
        }
        return resultantArray;
    }

    public static int[] removeEven1(int[] arr){
        ArrayList<Integer> resultantArrayList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0)
                resultantArrayList.add(arr[i]);
        }
        int[] resultantArray = new int[resultantArrayList.size()];
        int evenFlag = 0;
        for (Integer x : resultantArrayList){
            resultantArray[evenFlag] = x;
            evenFlag++;
        }
        return resultantArray;
    }

    public static void main(String[] args) {
        int[] arrayArgument = new int[]{1,2,3,4,6,7,8,9,5,10};
        System.out.println(Arrays.toString(removeEven(arrayArgument)));
        System.out.println(Arrays.toString(removeEven1(arrayArgument)));
    }
}
