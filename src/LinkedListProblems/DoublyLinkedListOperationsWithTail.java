package LinkedListProblems;

public class DoublyLinkedListOperationsWithTail {
    public class Node{
        public Integer dataOfElement;
        public Node nextElement;
        public Node previousElement;
    }

    public Node headNode;
    public Node tailNode;
    public int size;

    public DoublyLinkedListOperationsWithTail(){
        headNode = null;
        tailNode = null;
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
        else
            this.tailNode = temp;

        this.headNode = temp;

        size++;
    }

    public void insertAtTheEnd(Integer dataToInsert){
        /* //Code for the linked list which does not has the tail pointer
        Node temp = headNode;
        while (temp.nextElement != null){
            temp = temp.nextElement;
        }
        Node newNodeToInsert = new Node();
        newNodeToInsert.dataOfElement = dataToInsert;
        newNodeToInsert.nextElement = null;
        newNodeToInsert.previousElement = temp;
        temp.nextElement = newNodeToInsert;
        size++
         */
        Node newNodeToBeInserted = new Node();
        newNodeToBeInserted.dataOfElement = dataToInsert;
        tailNode.nextElement = newNodeToBeInserted;
        newNodeToBeInserted.previousElement = tailNode;
        newNodeToBeInserted.nextElement = null;
        tailNode = newNodeToBeInserted;

        size++;
    }

    public void insertAfterAValue(Integer dataAfterValueToBeInserted, Integer dataToInsert){
        Node temp = headNode;

        if (isLinkedListEmpty()){
            insertNewElementAtHead(dataToInsert);
            return;
        }

        while (temp.nextElement != null){
            if (temp.dataOfElement == dataAfterValueToBeInserted){
                Node newNToBeInserted = new Node();
                newNToBeInserted.dataOfElement = dataToInsert;
                newNToBeInserted.nextElement = temp.nextElement;
                newNToBeInserted.previousElement = temp;
                temp.nextElement = newNToBeInserted;

                size++;
                break;
            } else if (temp.dataOfElement == dataAfterValueToBeInserted && temp.nextElement == null) {
                insertAtTheEnd(dataToInsert);
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

        if (headNode == null)
            tailNode = null;

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
                if (temp == tailNode) {
                    tailNode = temp.previousElement;
                    temp.nextElement = null;
                }
                size--;
                break;
            }
            temp = temp.nextElement;
        }
    }

    public void deleteAtTail(){
        Node temp = this.tailNode;
        tailNode = temp.previousElement;
        if (tailNode == null)
            headNode = null;
        else
            temp.nextElement = null;

        size--;
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
        DoublyLinkedListOperationsWithTail doublyLinkedListOperationsWithTail = new DoublyLinkedListOperationsWithTail();
        doublyLinkedListOperationsWithTail.insertNewElementAtHead(15);
        doublyLinkedListOperationsWithTail.insertAtTheEnd(25);
        doublyLinkedListOperationsWithTail.insertAfterAValue(15,20);
        doublyLinkedListOperationsWithTail.insertAfterAValue(20,22);
        doublyLinkedListOperationsWithTail.insertAfterAValue(22,25);
        doublyLinkedListOperationsWithTail.deleteAtHead(15);
        doublyLinkedListOperationsWithTail.deleteAnyElementByValue(25);
        doublyLinkedListOperationsWithTail.deleteAnyElementByValue(25);
        doublyLinkedListOperationsWithTail.deleteAtTail();

        doublyLinkedListOperationsWithTail.printLinkedList();
    }
}
