package StacksAndQueues;

public class QueueUsingStackMoreEfficient<Integer> {
    private int maxSize;
    StacksBasicsOperation stack1;
    StacksBasicsOperation stack2;

    public QueueUsingStackMoreEfficient(int maxSize){
        this.maxSize = maxSize;
        stack1 = new StacksBasicsOperation(maxSize);
        stack2 = new StacksBasicsOperation(maxSize);
    }

    public boolean isEmpty(){
        if (this.stack2.isEmpty() && this.stack1.isEmpty())
            return true;
        else
            return false;
    }

    public boolean isFull(){
        if (this.stack1.isFull())
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
            System.out.println("The queue is already full");
            return;
        }
        stack1.pushInStack(dataToBeInserted);
    }

    public Integer dequeue(){
        Integer dataToBeDeleted = null;
        if (this.isEmpty()){
            System.out.println("This queue is empty");
            return null;
        } else if (this.stack2.isEmpty()){
            while (!this.stack1.isEmpty()){
                this.stack2.pushInStack(this.stack1.popInStack());
            }
            dataToBeDeleted = (Integer) this.stack2.popInStack();

        } else
            dataToBeDeleted = (Integer) this.stack2.popInStack();

        return dataToBeDeleted;
    }

    public static void main(String[] args) {
        QueueUsingStackMoreEfficient queueUsingStackMoreEfficient = new QueueUsingStackMoreEfficient(5);
        queueUsingStackMoreEfficient.enqueue(15);
        queueUsingStackMoreEfficient.enqueue(16);
        queueUsingStackMoreEfficient.enqueue(17);
        queueUsingStackMoreEfficient.enqueue(18);
        queueUsingStackMoreEfficient.enqueue(19);
        System.out.println(queueUsingStackMoreEfficient.dequeue());

        queueUsingStackMoreEfficient.printQueue();
    }
}
