package LinkedListProblems;

public class SearchingInLinkedList<Integer> {
    public class Node{
        public Node nextElement;
        public Integer data;
    }

    public Node headNode;
    public int size;

    public SearchingInLinkedList(){
        this.headNode = null;
        size = 0;
    }

    public void insertInLinkedListAtEnd(Integer data){
        Node temp = this.headNode;
        Node newInsertionNode = new Node();
        newInsertionNode.data = data;
        newInsertionNode.nextElement = null;
        if(temp == null)
            temp = newInsertionNode;
        else {
            while ( temp.nextElement != null ){
                temp = temp.nextElement;
            }
            temp.nextElement = newInsertionNode;
        }
        size++;
    }

    public boolean searchInLinkedList(Integer data){
        boolean isPresent = false;
        Node temp = this.headNode;

        while (temp.nextElement != null){
            if (temp.data == data){
                isPresent = true;
                break;
            }
            temp = temp.nextElement;
        }
        return isPresent;
    }

    public static void main(String[] args) {
        SearchingInLinkedList searchingInLinkedList = new SearchingInLinkedList();
        searchingInLinkedList.insertInLinkedListAtEnd(15);
        int Data = 15;
        boolean isNumberPresent = searchingInLinkedList.searchInLinkedList(Data);
        System.out.println("The number " + Data + "exists in the linked list" + isNumberPresent);
    }
}
