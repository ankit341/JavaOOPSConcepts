package LinkedListProblems;

class SinglyLinkedList<Integer>{
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

    public SinglyLinkedList(){
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

public class ReverseOfLinkedList<Integer> {
    public static <Integer> void reverseLinkedList(SinglyLinkedList<Integer> singlyLinkedList){
        SinglyLinkedList.Node currentNode = singlyLinkedList.getHeadNode();
        SinglyLinkedList.Node previousNode = null;
        SinglyLinkedList.Node nextNode = null;

        while (currentNode != null){
            nextNode = currentNode.nextElement;
            currentNode.nextElement = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        singlyLinkedList.headNode = previousNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        for (int i = 0; i <15; i++){
            singlyLinkedList.insertElementAtHead(i+1);
        }
        singlyLinkedList.printLinkedList();
        reverseLinkedList(singlyLinkedList);
        singlyLinkedList.printLinkedList();
    }
}

