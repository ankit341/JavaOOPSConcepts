package StacksAndQueues;

public class QueuesUsingStack<Integer> {
    private int maxSize;
    StacksBasicsOperation stack1;
    StacksBasicsOperation stack2;

    public QueuesUsingStack(int maxSize){
         this.maxSize = maxSize;
         stack1 = new StacksBasicsOperation(maxSize);
         stack2 = new StacksBasicsOperation(maxSize);
    }

    public boolean isEmpty(){
        if (this.stack2.isEmpty())
            return true;
        else
            return false;
    }

    public boolean isFull(){
        if (this.stack2.isFull())
            return true;
        else
            return false;
    }

    public void printQueue(){
        if (this.isEmpty()){
            System.out.println("The queue is empty");
            return;
        }
        int counterVariable = this.stack2.getTop();
        Integer intermediateArray[] = (Integer[]) stack2.getStackArray();
        while (counterVariable != -1){
            System.out.println(intermediateArray[counterVariable--]);
        }
    }

    public void enqueue(Integer dataToBeInserted){
        if (this.isFull()){
            System.out.println("The queue is full");
            return;
        }
        while (!stack2.isEmpty()){
            stack1.pushInStack(stack2.popInStack());
        }
        stack1.pushInStack(dataToBeInserted);

        while (!stack1.isEmpty()){
            stack2.pushInStack(stack1.popInStack());
        }
    }

    public Integer dequeue(){
        Integer dataDeleted = null;
        if(this.isEmpty()){
            System.out.println("There is no element in the queue");
            return null;
        }
        dataDeleted = (Integer) stack2.popInStack();
        return dataDeleted;
    }

    public static void main(String[] args) {
        QueuesUsingStack queuesUsingStack = new QueuesUsingStack(10);
        queuesUsingStack.enqueue(15);
        queuesUsingStack.enqueue(16);
        queuesUsingStack.enqueue(17);
        queuesUsingStack.enqueue(18);
        queuesUsingStack.enqueue(19);
        queuesUsingStack.enqueue(20);
        queuesUsingStack.dequeue();
        queuesUsingStack.dequeue();

        queuesUsingStack.printQueue();
    }
}
