package LinkedListProblems;

public class InsertionAtStart<Integer> {
    public class Node{
        public Integer data;
        public Node pointer;
    }
    public Node headNode;
    public int size;

    public InsertionAtStart(){
        headNode = null;
        size = 0;
    }

    public boolean isEmpty(){
        if (headNode == null)
            return true;
        else return false;
    }

    public void insertAtHead(Integer data){
        Node node = new Node();
        node.data = data;
        node.pointer = null;
        headNode = node;
        size++;
    }

    public void printLinkedList(){
        if (isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node temp = headNode;
        System.out.println("List is: ");
        while(temp.pointer != null){
            System.out.println(temp.data.toString() + " -> ");
            temp = temp.pointer;
        }
        System.out.println(temp.data.toString() + " -> null");
    }

    public static void main(String[] args) {
        InsertionAtStart newLinkedList = new InsertionAtStart();
        newLinkedList.insertAtHead(15);
        newLinkedList.printLinkedList();
    }
}
