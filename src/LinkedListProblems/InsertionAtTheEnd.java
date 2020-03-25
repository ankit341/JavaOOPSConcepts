package LinkedListProblems;

public class InsertionAtTheEnd<Integer> {
    public class Node{
        public Integer data;
        public Node nexElementPointer;
    }
    public Node headNode;
    public int size;

    public InsertionAtTheEnd(){
        headNode = null;
        size = 0;
    }
    public boolean isEmpty(){
        if (headNode == null)
            return true;
        else return false;
    }
    public void insertDataAtTheEnd(Integer data){
        Node node = new Node();
        node.data = data;
        node.nexElementPointer = null;
        Node temp = headNode;
        if (temp == null){
            headNode = node;
            size++;
        } else {
            while (temp.nexElementPointer != null) {
                temp = temp.nexElementPointer;
            }
            temp.nexElementPointer = node;
            temp.nexElementPointer.data = node.data;
            size++;
        }
    }

    public void displayLinkedList(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        } else {
            Node temp = headNode;
            System.out.println("List is :");
            while (temp.nexElementPointer != null) {
                System.out.println(temp.data + " -> ");
                temp = temp.nexElementPointer;
            }
            System.out.println(temp.data + " -> null ");
        }
    }

    public static void main(String[] args) {
        InsertionAtTheEnd newLinkedListNode = new InsertionAtTheEnd();
        newLinkedListNode.insertDataAtTheEnd(15);
        newLinkedListNode.insertDataAtTheEnd(20);
        newLinkedListNode.insertDataAtTheEnd(25);
        newLinkedListNode.displayLinkedList();
    }
}
