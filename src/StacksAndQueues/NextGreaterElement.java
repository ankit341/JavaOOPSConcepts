package StacksAndQueues;

import java.util.Arrays;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] arr){
        StacksBasicsOperation intermediateStack = new StacksBasicsOperation(arr.length);
        int[] resultantArray = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--){
           if (!intermediateStack.isEmpty()){
               while (!intermediateStack.isEmpty() && (int)intermediateStack.topElementInStack() <= arr[i]){
                   intermediateStack.popInStack();
               }
           }
           if (intermediateStack.isEmpty())
               resultantArray[i] = -1;
           else
               resultantArray[i] = (int)intermediateStack.topElementInStack();
           intermediateStack.pushInStack(arr[i]);
        }
        return resultantArray;
    }
    public static void main(String[] args) {
        int arrayArgument[] = new int[]{5,4,3,2,1};
        System.out.println(Arrays.toString(nextGreaterElement(arrayArgument)));
    }
}
