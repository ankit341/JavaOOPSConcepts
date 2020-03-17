package ArrayProblems;

import java.util.Arrays;

public class TwoNumbersAddUpToNQuickSort {

    /* This is the partition method in which we are partitioning the array till a single element
     * Becuase a single element in itself is sorted.
     * But we are partitioning in such a way such that the pivot element is always at the correct index.
    */
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high]; //pivot is always advised to take the median of the first,middle,last index element of the array.
        int indexRefernceOfSmallerElement = low -1; //so that we have the capability of swapping the first element and also ++ array index

        for(int jCounter = low; jCounter < high; jCounter++){
            if(arr[jCounter] < pivot){
                indexRefernceOfSmallerElement++;

                //step to place all the elements less than the pivot to the left of pivot without sorting them.
                int temp = arr[indexRefernceOfSmallerElement];
                arr[indexRefernceOfSmallerElement] = arr[jCounter];
                arr[jCounter] = temp;
            }
        }
        //steps to put pivot element at the correct position after one partition
        int temp = arr[high];
        arr[high] = arr[indexRefernceOfSmallerElement + 1];
        arr[indexRefernceOfSmallerElement+1] = temp;

        //returning the new index of the pivot element so that the next partitioning can happen on the other ekements as the pivot
        //has already come to its original index.
        return indexRefernceOfSmallerElement+1;
    }
    public static void quickSortArray(int[] arr, int low, int high){
        if(low < high) {
            //calling the pivot element function.
            int pivotElementPosition = partition(arr, low, high);

            //calling the quick sort function recursively on the either side of the pivot which has already been placed at the correct index.
            quickSortArray(arr, low, pivotElementPosition -1);
            quickSortArray(arr, pivotElementPosition+1,high);
        }
    }

    public static int[] findSum(int[] arr, int n){
        int[] result = new int[2];
        quickSortArray(arr,0, arr.length - 1);

        int lengthCounterBegin = 0;
        int lengthCOunterEnd = arr.length - 1;

        //Two find the sum of two numbers in array resulting to a given number we are starting a pointer at the beginning and one
        //starting from the end and then checking there sum with respect to the given number.
        //And if the sum is greater than the number given then we will reduce the end pointer and
        //If the sum is less than the given number then we will increase the startPointer.
        while(lengthCounterBegin != lengthCOunterEnd){
            System.out.println("we are here");
            int sumCheckVariable = arr[lengthCounterBegin] + arr[lengthCOunterEnd];
            if(sumCheckVariable > n){
                lengthCOunterEnd--;
            } else if(sumCheckVariable < n){
                lengthCounterBegin++;
            } else {
                result[0] = arr[lengthCounterBegin];
                result[1] = arr[lengthCOunterEnd];
                break;
            }
        }
    return result;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,9,2,8,3,7,4,6,5};//initializing array
        System.out.println(Arrays.toString(findSum(arr,10))); //calling the method
    }
}