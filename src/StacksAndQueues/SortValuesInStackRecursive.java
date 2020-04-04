package StacksAndQueues;

public class SortValuesInStackRecursive<T> {

    public static void insertInStack(StacksBasicsOperation stacksBasicsOperation, Integer value){
        if (stacksBasicsOperation.isEmpty() || value < (Integer) stacksBasicsOperation.topElementInStack())
            stacksBasicsOperation.pushInStack(value);
        else {
            Integer tempInteger = (Integer) stacksBasicsOperation.popInStack();
            insertInStack(stacksBasicsOperation,value);
            stacksBasicsOperation.pushInStack(tempInteger);
        }
    }

    public static StacksBasicsOperation<Integer> sortAStackRecursive(StacksBasicsOperation stacksBasicsOperation){

        if (!stacksBasicsOperation.isEmpty()){
            Integer value = (Integer) stacksBasicsOperation.popInStack();
            sortAStackRecursive(stacksBasicsOperation);
            insertInStack(stacksBasicsOperation,value);
        }
        return stacksBasicsOperation;
    }
    public static void main(String[] args) {
        StacksBasicsOperation stacksBasicsOperation = new StacksBasicsOperation(5);
        stacksBasicsOperation.pushInStack(10);
        stacksBasicsOperation.pushInStack(12);
        stacksBasicsOperation.pushInStack(1);
        stacksBasicsOperation.pushInStack(11);
        stacksBasicsOperation.pushInStack(6);

        StacksBasicsOperation stackResultant = sortAStackRecursive(stacksBasicsOperation);

        stackResultant.printElementsInStack();

    }
}
