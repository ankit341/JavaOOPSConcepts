package StacksAndQueues;

import java.util.Objects;

public class QueuesBasicOperation<Integer> {
    private int frontElement;
    private int backElement;
    private Integer queueArray[];
    private int maxSize;
    private int currentSize;

    public QueuesBasicOperation(int maxSize) {
        this.maxSize = maxSize;
        frontElement = 0;
        backElement = -1;
        currentSize = 0;
        queueArray = (Integer[]) new Object[this.maxSize];
    }

    public int getFrontElement() {
        return frontElement;
    }

    public void setFrontElement(int frontElement) {
        this.frontElement = frontElement;
    }

    public int getBackElement() {
        return backElement;
    }

    public void setBackElement(int backElement) {
        this.backElement = backElement;
    }

    public Integer[] getQueueArray() {
        return queueArray;
    }

    public void setQueueArray(Integer[] queueArray) {
        this.queueArray = queueArray;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public boolean isEmpty(){
        if (this.currentSize == 0) {
            System.out.println("The list is empty");
            return true;
        }
        else
            return false;
    }

    public Integer topElementOfQueue(){
        Integer topElementOfQueue = null;
        if (this.currentSize == 0){
            System.out.println("The list is empty");
            return null;
        }
        topElementOfQueue = this.queueArray[frontElement];
        return topElementOfQueue;
    }

    public boolean isFull(){
        if (this.currentSize == this.maxSize)
            return true;
        else
            return false;
    }

    public void enqueue(Integer dataToBeInserted){
        if (this.isFull()){
            System.out.println("The list is full");
            return;
        }
        this.backElement = (this.backElement + 1) % maxSize; //same thing with the back element to keep them in the range
        this.queueArray[backElement] = dataToBeInserted;
        currentSize++;
    }

    public Integer dequeue(){
        Integer dataDeleted = null;
        if (this.isEmpty()){
            System.out.println("The list is empty");
            return null;
        }
        dataDeleted = this.queueArray[frontElement];
        frontElement = (frontElement + 1) % maxSize; //to keep the front pointer in range of the maximum sie
        currentSize--;
        return dataDeleted;
    }

    public void printTheQueue(){
        int temporaryFrontElement = this.frontElement;
        if (isEmpty()){
            System.out.println("The list is empty");
            return;
        }
        while (temporaryFrontElement != this.backElement + 1 ){
            System.out.println(this.queueArray[temporaryFrontElement]);
            temporaryFrontElement++;
        }
    }

    public static void main(String[] args) {
        QueuesBasicOperation queuesBasicOperation = new QueuesBasicOperation(10);
        queuesBasicOperation.enqueue(15);
        queuesBasicOperation.enqueue(16);
        queuesBasicOperation.enqueue(17);
        queuesBasicOperation.dequeue();
        queuesBasicOperation.enqueue(18);
        queuesBasicOperation.dequeue();
        System.out.println("The top Element in the queue is " + " " + queuesBasicOperation.topElementOfQueue());
        System.out.println("The back element in the queue is" + queuesBasicOperation.queueArray[queuesBasicOperation.getBackElement()]);
        System.out.println("The front element in the queue is" + queuesBasicOperation.queueArray[queuesBasicOperation.getBackElement()]);

        queuesBasicOperation.printTheQueue();
    }
}
