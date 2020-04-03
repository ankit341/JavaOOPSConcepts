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
            if (intermediateStack1.isEmpty() || integerTemp >= (Integer) intermediateStack1.topElementInStack())
                intermediateStack1.pushInStack(integerTemp);
            else {
                while (!intermediateStack1.isEmpty() && integerTemp < (Integer) intermediateStack1.topElementInStack()){
                    stackOperation.pushInStack((Integer) intermediateStack1.popInStack());
                } intermediateStack1.pushInStack(integerTemp);
            }
        }
        while (!intermediateStack1.isEmpty()){
            stackOperation.pushInStack((Integer) intermediateStack1.popInStack());
        }
    }
}
