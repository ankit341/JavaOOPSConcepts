package LinkedListProblems;

class SinglyLinkedList2<Integer>{
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

    public SinglyLinkedList2(){
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
            System.out.print(temp.data + " - > ");
            temp = temp.nextElement;
        }
        System.out.print(temp.data + " -> null ");
    }

}

public class MiddlePointOfLinkedList {
    public static <Integer> Object findMiddlePointOfLinkedList(SinglyLinkedList2<Integer> singlyLinkedList2){
        SinglyLinkedList2.Node slowPointer = singlyLinkedList2.headNode;
        SinglyLinkedList2.Node fastPointer = singlyLinkedList2.headNode;
        Object middlePoint = null;
        /*
        while (slowPointer != null && fastPointer != null && fastPointer.nextElement != null){
            slowPointer = slowPointer.nextElement;
            fastPointer = fastPointer.nextElement.nextElement;
            if (fastPointer == null || fastPointer.nextElement == null)
                middlePoint = slowPointer.data;
            else
                System.out.println("The list is cyclic and it does not have a middle point");
        }

         */

        while (fastPointer != null && fastPointer.nextElement != null){
            slowPointer = slowPointer.nextElement;
            fastPointer = fastPointer.nextElement.nextElement;
        }

        middlePoint = slowPointer.data;

        return middlePoint;
    }

    public static void main(String[] args) {
        SinglyLinkedList2 singlyLinkedList = new SinglyLinkedList2();
        for (int i = 0; i <15; i++){
            singlyLinkedList.insertElementAtHead(i+1);
        }
        //singlyLinkedList.insertElementAtHead(13);
        singlyLinkedList.printLinkedList();
        System.out.println(findMiddlePointOfLinkedList(singlyLinkedList));
    }
}
