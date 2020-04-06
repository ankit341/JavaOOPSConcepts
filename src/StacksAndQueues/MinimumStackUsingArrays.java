package StacksAndQueues;

public class MinimumStackUsingArrays {
    private int maxSize;
    private int topOfTheStackMain;
    private int topOfTheStackMinimum;
    private int[] arrayOfStack;
    private int[] arrayToStoreTheMinimumValueAtAnyPoint;

    public MinimumStackUsingArrays(int maxSize){
        this.maxSize = maxSize;
        topOfTheStackMain = -1;
        topOfTheStackMinimum = -1;
        arrayOfStack = new int[this.maxSize];
        arrayToStoreTheMinimumValueAtAnyPoint = new int[this.maxSize];
    }
    public boolean isEmpty(){
        if (topOfTheStackMain == -1)
            return true;
        else
            return false;
    }
    public boolean isFull(){
        if (topOfTheStackMain == maxSize-1)
            return true;
        else
            return false;
    }
    public Integer popElementsOfStack(){
        Integer dataToBeDeleted = -1;
        if (isEmpty()){
            System.out.println("No elements to deque in stack");
            return null;
        }
        else {
            dataToBeDeleted = arrayOfStack[topOfTheStackMain--];
            topOfTheStackMinimum--;
        }
        return dataToBeDeleted;
    }
    public void pushElementsInStack(Integer dataToBeInserted){
        if (isFull()){
            System.out.println("The stack is already full");
            return;
        } else if (isEmpty()){
            arrayOfStack[++topOfTheStackMain] = dataToBeInserted;
            arrayToStoreTheMinimumValueAtAnyPoint[++topOfTheStackMinimum] = dataToBeInserted;
        } else {
            arrayOfStack[++topOfTheStackMain] = dataToBeInserted;
            if (arrayToStoreTheMinimumValueAtAnyPoint[topOfTheStackMinimum] > dataToBeInserted)
                arrayToStoreTheMinimumValueAtAnyPoint[++topOfTheStackMinimum] = dataToBeInserted;
            else {
                int topElementInSecondStack = arrayToStoreTheMinimumValueAtAnyPoint[topOfTheStackMinimum];
                arrayToStoreTheMinimumValueAtAnyPoint[++topOfTheStackMinimum] = topElementInSecondStack;
            }
        }
    }
    public int min(){
        if (isEmpty())
            return -1;
        else
            return arrayToStoreTheMinimumValueAtAnyPoint[topOfTheStackMinimum];
    }

    public static void main(String[] args) {
        MinimumStackUsingArrays minimumStack = new MinimumStackUsingArrays(5);
        minimumStack.pushElementsInStack(5);
        minimumStack.pushElementsInStack(4);
        minimumStack.pushElementsInStack(1);
        minimumStack.pushElementsInStack(10);
        minimumStack.pushElementsInStack(2);

        minimumStack.popElementsOfStack();
        minimumStack.popElementsOfStack();
        minimumStack.popElementsOfStack();

        System.out.println(minimumStack.min());
    }
}
