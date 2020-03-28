package LinkedListProblems;

public class DeletionAtHead<Integer> {
    public class Node{
        public Integer data;
        public Node nextElement;
    }

    public Node headNode;
    public int size;

    public DeletionAtHead(){
        headNode = null;
        size = 0;
    }

    public boolean isLinkedListEmpty(){
        if (headNode == null)
            return true;
        else
            return false;
    }

    public Integer deletionAtHeadLinkedList(){
        Integer deletedLinkedListValue = null;
        Node temp = headNode;
        if(isLinkedListEmpty()){
            System.out.println("Linked list is empty");
        } else {
            deletedLinkedListValue = temp.data;
            headNode = temp.nextElement;
            size--;
        }
        return deletedLinkedListValue;
    }
}
