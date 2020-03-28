package LinkedListProblems;

public class DeleteByValueLinkedList<Integer> {
    public class Node{
        public Integer data;
        public Node nextElement;
    }

    public Node headNode;
    public int size;

    public DeleteByValueLinkedList(){
        headNode = null;
        size = 0;
    }

    public boolean isEmpty(){
        if (headNode == null)
            return true;
        else
            return false;
    }

    public Integer deleteElementInLinkedListByValue(Integer data){
        Integer dataDeleted = null;
        Node temp = headNode;
        if (isEmpty())
            System.out.println("List is Empty");
        else {
            while ( temp.nextElement.nextElement != null){
                if (temp.nextElement.data == data){
                    dataDeleted = temp.nextElement.data;
                    temp.nextElement = temp.nextElement.nextElement;
                    break;
                }
                temp = temp.nextElement;
            }
        }
        return dataDeleted;
    }
}
