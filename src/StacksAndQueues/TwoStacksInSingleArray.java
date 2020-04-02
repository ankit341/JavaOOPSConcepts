package StacksAndQueues;

import java.util.Arrays;

public class TwoStacksInSingleArray<Integer> {
    private int maxSize;
    private Integer[] stackArray;
    private int topElementStack1;
    private int topElementStack2;

    public TwoStacksInSingleArray(int maxSize){
        this.maxSize = maxSize;
        stackArray = (Integer[]) new Object[maxSize];
        topElementStack1 = -1;
        topElementStack2 = maxSize;
    }

    public void pushStack1(Integer dataToBeInserted){
        if (topElementStack1 >= topElementStack2 - 1){
            System.out.println("The stack array is full");
            return;
        }
        stackArray[++topElementStack1] = dataToBeInserted;
    }

    public Integer popStack1(){
        Integer dataDeleted = null;
        if (topElementStack1 == -1){
            System.out.println("The stack is empty");
            return null;
        }
        dataDeleted = stackArray[topElementStack1];
        stackArray[topElementStack1] = null;
        topElementStack1--;
        return dataDeleted;
    }

    public void pushStack2(Integer dataToBeInserted){
        if(topElementStack1 >= topElementStack2 - 1){
            System.out.println("The stack array is full");
            return;
        }
        stackArray[--topElementStack2] = dataToBeInserted;
    }

    public Integer popStack2(){
        Integer dataDeleted = null;
        if (topElementStack2 == maxSize){
            System.out.println("The stack2 is empty");
            return null;
        }
        dataDeleted = stackArray[topElementStack2];
        stackArray[topElementStack2] = null;
        topElementStack2++;
        return dataDeleted;
    }

    public void printStack1(){
        int tempTopStack1 = topElementStack1;
        while (tempTopStack1 != -1){
            System.out.println(stackArray[tempTopStack1]);
            tempTopStack1--;
        }
    }

    public void printStack2(){
        int tempTopStack2 = topElementStack2;
        while (tempTopStack2 != maxSize){
            System.out.println(stackArray[tempTopStack2]);
            tempTopStack2++;
        }
    }

    public void printArray(){
        System.out.println(Arrays.toString(stackArray));
    }

    public static void main(String[] args) {
        TwoStacksInSingleArray twoStacksInSingleArray = new TwoStacksInSingleArray<>(5);
        twoStacksInSingleArray.pushStack1(15);
        twoStacksInSingleArray.pushStack2(25);
        twoStacksInSingleArray.pushStack2(25);
        twoStacksInSingleArray.pushStack2(25);
        twoStacksInSingleArray.pushStack2(25);
        twoStacksInSingleArray.pushStack2(25);
        twoStacksInSingleArray.popStack2();
        twoStacksInSingleArray.popStack1();
        twoStacksInSingleArray.popStack1();

        twoStacksInSingleArray.printStack1();
        twoStacksInSingleArray.printStack2();

        twoStacksInSingleArray.printArray();
    }
}
