package LinkedListProblems;

public class InsertionAnywhereInLinkedList<Integer> {
    public class Node{
        public Node nextElement;
        public Integer data;
    }

    public Node headNode;
    public int size;

    public InsertionAnywhereInLinkedList(){
        headNode = null;
        size = 0;
    }

    public void insertAtHead(Integer data){
        Node node = new Node();
        node.data = data;
        node.nextElement = headNode;
        headNode = node;
        size++;
    }

    public void insertElementAnywhereLinkedList(Integer data,Integer counterOfInsertion){
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextElement = null;
        Node temp = headNode;

        while (temp.nextElement != null){
            if (temp.data == counterOfInsertion){
                newNode.nextElement = temp.nextElement;
                temp.nextElement = newNode;
                break;
            }
            temp = temp.nextElement;
        }
        if (temp.nextElement == null)
            System.out.println("The value " + counterOfInsertion + "does not exist in the linked list");
    }

    public void printLinkedList(){
        Node temp = headNode;
        System.out.println("The list is " + " -> ");
        while (temp.nextElement != null){
            System.out.println(temp.data + " -> ");
            temp = temp.nextElement;
        }
        System.out.println(temp.data + " -> null");
    }

    public static void main(String[] args) {
        InsertionAnywhereInLinkedList insertionAnywhereInLinkedList = new InsertionAnywhereInLinkedList();
        insertionAnywhereInLinkedList.insertAtHead(15);
        insertionAnywhereInLinkedList.insertAtHead(20);
        insertionAnywhereInLinkedList.insertAtHead(25);
        insertionAnywhereInLinkedList.insertElementAnywhereLinkedList(30,26);
        insertionAnywhereInLinkedList.printLinkedList();
    }
}
