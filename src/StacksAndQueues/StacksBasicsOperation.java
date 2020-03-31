package StacksAndQueues;

public class StacksBasicsOperation<Integer> {
    private int maxSize;
    private int topElement;
    private Integer stackArray[];

    /*
    Java does not allow generic type arrays. So we have used an
    array of Object type and type-casted it to the generic type V.
    This type-casting is unsafe and produces a warning.
    */
    @SuppressWarnings("unchecked")
    public StacksBasicsOperation(int maxSize) {
        this.maxSize = maxSize;
        this.topElement = -1;
        this.stackArray =(Integer[]) new Object[this.maxSize];
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getTop() {
        return topElement;
    }

    public void setTop(int top) {
        this.topElement = top;
    }

    public Integer getStackArray() {
        return (Integer) stackArray;
    }

    public void setStackArray(Integer[] stackArray) {
        this.stackArray = stackArray;
    }

    public boolean isEmpty(){
        if (this.topElement == -1)
            return true;
        else
            return false;
    }

    public boolean isFull(){
        if (this.topElement == this.maxSize -1)
            return true;
        else
            return false;
    }

    public void pushInStack(Integer dataToBeInserted){
        if (this.isFull()){
            System.out.println("The stack is already full");
            return;
        }
        this.stackArray[++topElement] = dataToBeInserted;
    }

    public Integer popInStack(){
        Integer dataDeleted = null;
        if (this.isEmpty()){
            System.out.println("The stack is empty");
            return null;
        }
        dataDeleted = this.stackArray[topElement--];
        return dataDeleted;
    }

    public Integer topElementInStack(){
        Integer topElementInStack = null;
        if (this.isEmpty()){
            System.out.println("The stack is empty");
            return null;
        }
        topElementInStack = this.stackArray[topElement];
        return topElementInStack;
    }

    public void printElementsInStack(){
        int counterVariable = this.topElement;
        while (counterVariable != -1){
            System.out.println(stackArray[counterVariable]);
            counterVariable--;
        }
    }

    public static void main(String[] args) {
        StacksBasicsOperation stacksBasicsOperation = new StacksBasicsOperation(10);
        stacksBasicsOperation.pushInStack(15);
        stacksBasicsOperation.pushInStack(16);
        stacksBasicsOperation.pushInStack(17);
        stacksBasicsOperation.popInStack();
        stacksBasicsOperation.pushInStack(18);
        stacksBasicsOperation.popInStack();
        System.out.println("The current top element in the stack is" +" " + stacksBasicsOperation.topElementInStack());

        stacksBasicsOperation.printElementsInStack();
    }
}
