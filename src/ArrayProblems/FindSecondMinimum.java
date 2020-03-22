package ArrayProblems;

import java.util.*;

public class FindSecondMinimum {

    public static int partition(int[] arr, int low, int high){
        int lowerReference = low - 1;
        int pivotElement = arr[high];

        for (int iCounter = low; iCounter < high; iCounter++){
            if(arr[iCounter] < pivotElement){
                lowerReference++;

                int temp = arr[lowerReference];
                arr[lowerReference] = arr[iCounter];
                arr[iCounter] = temp;
            }
        }
        int temp = arr[high];
        arr[high] = arr[lowerReference + 1];
        arr[lowerReference + 1] = temp;

        return ++lowerReference;
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pivotElement = partition(arr,low,high);

            quickSort(arr,low,pivotElement-1);
            quickSort(arr,pivotElement+1,high);
        }
    }
    public static int findSecondMaximum(int[] arr)
    {
        int result = 0;
        int high = arr.length;
        Set<Integer> intermediateSet = new HashSet<>();
        for (int i = 0; i < high; i++){
            intermediateSet.add(arr[i]);
        }
        System.out.println(intermediateSet.toString());
        Integer[] intermeidateArray = new Integer[intermediateSet.size()];
        intermediateSet.toArray(intermeidateArray);
        System.out.println(Arrays.toString(intermeidateArray));
        quickSort(arr,0,intermediateSet.size() - 1);
        System.out.println(Arrays.toString(intermeidateArray));
        int maximumNumber = arr[high-1];
        int index = high - 1;
        for (int i = intermeidateArray.length - 1; i > 0; i--){
            if(maximumNumber < intermeidateArray[i]) {
                maximumNumber = intermeidateArray[i];
                index = i;
            }
        }
        if(intermeidateArray.length == 1)
            result = intermeidateArray[index];
        else
            result = intermeidateArray[index - 1];
        return result;
    }

    public static void main(String[] args) {
        int[] arrayArgument = new int[]{9,2,3,6};
        System.out.println(findSecondMaximum(arrayArgument));
    }
}