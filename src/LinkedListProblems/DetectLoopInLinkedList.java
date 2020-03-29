package LinkedListProblems;

import java.util.ArrayList;

class SinglyLinkedLists<Integer>{
    public class Node{
        public Node nextElement;
        public Integer data;
    }

    public Node headNode;
    public int size;

    public Node getHeadNode() {
        return headNode;
    }

    public int getSize() {
        return size;
    }

    public SinglyLinkedLists(){
        headNode = null;
        size = 0;
    }

    public void insertElementAtHead(Integer dataToBeInserted){
        Node newElementToBeInserted = new Node();
        newElementToBeInserted.data = dataToBeInserted;
        if (headNode == null)
            newElementToBeInserted.nextElement = null;
        else
            newElementToBeInserted.nextElement = headNode;
        this.headNode = newElementToBeInserted;
    }

    public void printLinkedList(){
        Node temp = this.headNode;
        System.out.println("The List is : ");
        while (temp.nextElement != null){
            System.out.println(temp.data + " - > ");
            temp = temp.nextElement;
        }
        System.out.println(temp.data + " -> null ");
    }

}

public class DetectLoopInLinkedList<Integer> {
    /*
    This logic is conceptually wrong as we cannot prove a linked list has loop while checking its value in the elements
    as one value can be there in the elements with different address. So what we have to do is to check the address or the
    nextPointer field and check that if an address of the element is repeated while traversing the list.
     */
    public static <Integer> boolean detectLoopInLinkedList(SinglyLinkedLists<Integer> singlyLinkedLists){
        SinglyLinkedLists<Integer>.Node currentNode = singlyLinkedLists.getHeadNode();
        ArrayList<Integer> arrayIntermediate = new ArrayList<>();
        boolean isLoop = false;
        while (currentNode != null){
            if (arrayIntermediate.contains(currentNode.data)) {
                isLoop = true;
                break;
            } else
                arrayIntermediate.add(currentNode.data);

            currentNode = currentNode.nextElement;
        }
        return isLoop;
    }

    public static <Integer> boolean detectLoopInLinkedListCorrect(SinglyLinkedLists<Integer> singlyLinkedLists){
        SinglyLinkedLists.Node slowPointer = singlyLinkedLists.getHeadNode();
        SinglyLinkedLists.Node fastPointer = singlyLinkedLists.getHeadNode();
        boolean isLinkedLoop = false;

        while (slowPointer != null && fastPointer != null && fastPointer.nextElement != null ){
            slowPointer = slowPointer.nextElement;
            fastPointer = fastPointer.nextElement.nextElement;

            if (slowPointer == fastPointer){
                isLinkedLoop = true;
                break;
            }
        }
        return isLinkedLoop;
    }

    public static void main(String[] args) {
        SinglyLinkedLists singlyLinkedList = new SinglyLinkedLists();
        for (int i = 0; i <15; i++){
            singlyLinkedList.insertElementAtHead(i+1);
        }
        singlyLinkedList.insertElementAtHead(13);
        System.out.println("The linked list having loop" + detectLoopInLinkedListCorrect(singlyLinkedList));
        singlyLinkedList.headNode.nextElement.nextElement.nextElement.nextElement.nextElement = singlyLinkedList.headNode;
        System.out.println("The linked list having loop" + detectLoopInLinkedListCorrect(singlyLinkedList));
        System.out.println(detectLoopInLinkedList(singlyLinkedList));
    }
}
