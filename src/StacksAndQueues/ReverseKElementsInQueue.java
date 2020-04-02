package StacksAndQueues;

public class ReverseKElementsInQueue<Integer> {
    public static <Integer> void reverseK(QueuesBasicOperation<Integer> queue, int k){
        Integer[] intermediateArray = (Integer[]) new Object[k];
        while (k != -1){
            intermediateArray[--k] = queue.dequeue();
        }
        for (int i = queue.getFrontElement(); i >= 0; i++){
            queue.getQueueArray()[i - 1] = intermediateArray[i-1];
        }
    }

    public static <Integer> void reverseKUsingStack(QueuesBasicOperation<Integer> queue, int k){

        if (queue.isEmpty() || k > queue.getMaxSize() || k <= 0)
            return;

        StacksBasicsOperation<Integer> stacksBasicsOperation = new StacksBasicsOperation<Integer>(k);

        while (!stacksBasicsOperation.isFull()){
            stacksBasicsOperation.pushInStack(queue.dequeue());
        }

        while (!stacksBasicsOperation.isEmpty()){
            queue.enqueue(stacksBasicsOperation.popInStack());
        }

        int currentSizeOfQueue = queue.getCurrentSize();
        for (int i = 0; i < currentSizeOfQueue - k; i++){
            queue.enqueue(queue.dequeue());
        }
    }

    public static void main(String[] args) {
        QueuesBasicOperation queue = new QueuesBasicOperation(10);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);

        reverseKUsingStack(queue,5);

        System.out.print("Queue: ");
        while(!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
