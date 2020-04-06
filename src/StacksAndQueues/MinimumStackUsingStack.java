package StacksAndQueues;

public class MinimumStackUsingStack {
    private int maxSize;
    private StacksBasicsOperation<Integer> mainStack;
    private StacksBasicsOperation<Integer> minimumValueStack;

    public MinimumStackUsingStack(int maxSize){
        this.maxSize = maxSize;
        mainStack = new StacksBasicsOperation<>(this.maxSize);
        minimumValueStack = new StacksBasicsOperation<>(this.maxSize);
    }
    public void pushInTheStack(Integer dataToBeInserted){
        if (mainStack.isEmpty() && minimumValueStack.isEmpty()){
            mainStack.pushInStack(dataToBeInserted);
            minimumValueStack.pushInStack(dataToBeInserted);
        } else {
            mainStack.pushInStack(dataToBeInserted);
            if (dataToBeInserted < minimumValueStack.topElementInStack())
                minimumValueStack.pushInStack(dataToBeInserted);
            else
                minimumValueStack.pushInStack(minimumValueStack.topElementInStack());
        }
    }
    public Integer popInTheStack(){
        Integer dataDeleted = mainStack.popInStack();
        minimumValueStack.popInStack();
        return dataDeleted;
    }
    public int minimumNumberInStack(){
        int minimumNumber = minimumValueStack.topElementInStack();
        return minimumNumber;
    }

    public static void main(String[] args) {
        MinimumStackUsingStack minimumStackUsingStack = new MinimumStackUsingStack(5);
        minimumStackUsingStack.pushInTheStack(5);
        minimumStackUsingStack.pushInTheStack(1);
        minimumStackUsingStack.pushInTheStack(10);
        minimumStackUsingStack.pushInTheStack(11);
        minimumStackUsingStack.pushInTheStack(0);

        System.out.println(minimumStackUsingStack.minimumNumberInStack());
    }
}
