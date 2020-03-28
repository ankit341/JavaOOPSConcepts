package LinkedListProblems;

public class LengthOfTheLinkedList<Integer> {
    public class Node{
        public Node nextElement;
        public Integer dataOfElement;
    }

    public Node headNode;
    public int size;

    public LengthOfTheLinkedList(){
        headNode = null;
        size = 0;
    }

    public boolean isLinkedListEmpty(){
        if (this.headNode == null)
            return true;
        else
            return false;
    }

    public int lengthOfTheLinkedList(){
        Node temp = this.headNode;
        int lengthOfLinkedList = 0;

        if (isLinkedListEmpty())
            return lengthOfLinkedList;
        else {
            while (temp != null) {
                lengthOfLinkedList++ ;
                temp = temp.nextElement;
            }
        }
        return lengthOfLinkedList;
    }
}
