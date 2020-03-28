package LinkedListProblems;

public class DoublyLinkedListOperations<Integer> {
    public class Node{
        public Integer dataOfElement;
        public Node nextElement;
        public Node previousElement;
    }

    public Node headNode;
    public int size;

    public DoublyLinkedListOperations(){
        headNode = null;
        size = 0;
    }

    public boolean isLinkedListEmpty(){
        if (headNode == null)
            return true;
        else
            return false;
    }

    public void insertNewElementAtHead(Integer dataToInsert){
        Node temp = new Node();
        temp.dataOfElement = dataToInsert;
        temp.nextElement = this.headNode;
        temp.previousElement = null;

        if(headNode != null)
            this.headNode.previousElement = temp;

        this.headNode = temp;

        size++;
    }

    public void insertAtTheEnd(Integer dataToInsert){
        Node temp = headNode;
        while (temp.nextElement != null){
            temp = temp.nextElement;
        }
        Node newNodeToInsert = new Node();
        newNodeToInsert.dataOfElement = dataToInsert;
        newNodeToInsert.nextElement = null;
        newNodeToInsert.previousElement = temp;
        temp.nextElement = newNodeToInsert;

        size++;
    }

    public void insertAfterAValue(Integer dataAfterValueToBeInserted, Integer dataToInsert){
        Node temp = headNode;

        while (temp.nextElement != null){
            if (temp.dataOfElement == dataAfterValueToBeInserted){
                Node newNToBeInserted = new Node();
                newNToBeInserted.dataOfElement = dataToInsert;
                newNToBeInserted.nextElement = temp.nextElement;
                newNToBeInserted.previousElement = temp;
                temp.nextElement = newNToBeInserted;

                size++;
                break;
            }
            temp = temp.nextElement;
        }
    }

    public void deleteAtHead(Integer dataToBeDeleted){
        Node temp = headNode;
        headNode = temp.nextElement;
        temp.previousElement = null;

        size--;
    }

    public void deleteAnyElementByValue(Integer dataToBeDeleted){
        Node temp = this.headNode;

        if (temp.dataOfElement == dataToBeDeleted){
            deleteAtHead(dataToBeDeleted);
            return;
        }

        while (temp != null){
            if (temp.dataOfElement == dataToBeDeleted){
                temp.previousElement.nextElement = temp.nextElement;
                if(temp.nextElement != null)
                    temp.nextElement.previousElement = temp.previousElement;
            size--;
            break;
            }
            temp = temp.nextElement;
        }
    }

    public void printLinkedList(){
        if(isLinkedListEmpty()){
            System.out.println("The linked List is empty");
            return;
        }
        Node temp = this.headNode;
        System.out.println("The elements in the list are : ");
        while (temp.nextElement != null){
            System.out.println(temp.dataOfElement.toString() + " - > ");
            temp = temp.nextElement;
        }
        System.out.println(temp.dataOfElement.toString() + " - > null");
    }

    public static void main(String[] args) {
        DoublyLinkedListOperations doublyLinkedListOperations = new DoublyLinkedListOperations();
        doublyLinkedListOperations.insertNewElementAtHead(15);
        doublyLinkedListOperations.insertAtTheEnd(25);
        doublyLinkedListOperations.insertAfterAValue(15,20);
        doublyLinkedListOperations.insertAfterAValue(20,22);
        doublyLinkedListOperations.insertAfterAValue(22,25);
        doublyLinkedListOperations.deleteAtHead(15);
        doublyLinkedListOperations.deleteAnyElementByValue(25);
        doublyLinkedListOperations.deleteAnyElementByValue(25);

        doublyLinkedListOperations.printLinkedList();
    }
}
