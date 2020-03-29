package LinkedListProblems;

import java.util.ArrayList;

class SinglyLinkedList3<Integer>{
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

    public SinglyLinkedList3(){
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

    public void deleteElementByValueAndIndex(Integer dataToDelete, int index){
        Node temp = this.headNode;
        Node previous = null;
        while (temp != null){
            if (temp.data == dataToDelete && index == 0){
                previous.nextElement = temp.nextElement;
                temp.nextElement = null;
            }
            previous = temp;
            temp = temp.nextElement;
            index--;
        }
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

public class RemovingDuplicatesInLinkedList {
    public static <Integer> void removeDuplicates(SinglyLinkedList3<Integer> singlyLinkedList3){
        SinglyLinkedList3<Integer>.Node currentNode = singlyLinkedList3.getHeadNode();
        ArrayList<Integer> arrayListIntermediate = new ArrayList<>();
        int index = 0;
        while (currentNode != null){
            if (arrayListIntermediate.contains(currentNode.data)){
                singlyLinkedList3.deleteElementByValueAndIndex(currentNode.data, index);
            } else
                arrayListIntermediate.add(currentNode.data);
            index++;
            currentNode = currentNode.nextElement;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList3 singlyLinkedList3 = new SinglyLinkedList3();
        for (int i = 0; i < 15; i++){
            singlyLinkedList3.insertElementAtHead(i+1);
        }
        singlyLinkedList3.printLinkedList();
        singlyLinkedList3.insertElementAtHead(13);
        singlyLinkedList3.printLinkedList();
        removeDuplicates(singlyLinkedList3);
        singlyLinkedList3.printLinkedList();
    }
}
