package StacksAndQueues;

public class SortValuesInStack<T> {
    public static void sortValuesInStack(StacksBasicsOperation<Integer> stackOperation){
        if (stackOperation.isEmpty()){
            System.out.println("The stack is empty");
            return;
        }
        StacksBasicsOperation intermediateStack1 = new StacksBasicsOperation(stackOperation.getMaxSize());

        while (!stackOperation.isEmpty()){
            Integer integerTemp = stackOperation.popInStack();

            while (!intermediateStack1.isEmpty() && integerTemp < (Integer) intermediateStack1.topElementInStack()){
                stackOperation.pushInStack((Integer) intermediateStack1.popInStack());
            } intermediateStack1.pushInStack(integerTemp);
        }

        while (!intermediateStack1.isEmpty()){
            stackOperation.pushInStack((Integer) intermediateStack1.popInStack());
        }
    }

    public static void main(String[] args) {
        StacksBasicsOperation stacksBasicsOperation = new StacksBasicsOperation(5);
        stacksBasicsOperation.pushInStack(10);
        stacksBasicsOperation.pushInStack(12);
        stacksBasicsOperation.pushInStack(1);
        stacksBasicsOperation.pushInStack(11);
        stacksBasicsOperation.pushInStack(6);

        sortValuesInStack(stacksBasicsOperation);

        stacksBasicsOperation.printElementsInStack();
    }
}
