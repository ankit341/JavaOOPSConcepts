package LinkedListProblems;

import java.util.ArrayList;

class SinglyLinkedList5<Integer>{
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

    public SinglyLinkedList5(){
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

    public void insertDataAtTheEnd(Integer data){
        Node node = new Node();
        node.data = data;
        node.nextElement = null;
        Node temp = headNode;
        if (temp == null){
            headNode = node;
        } else {
            while (temp.nextElement != null) {
                temp = temp.nextElement;
            }
            temp.nextElement = node;
            temp.nextElement.data = node.data;
        }
        size++;
    }

    public <Integer> void removeDuplicates(){
        Node currentNode = this.headNode;
        ArrayList<Integer> arrayListIntermediate = new ArrayList<>();
        int index = 0;
        while (currentNode != null){
            if (arrayListIntermediate.contains(currentNode.data)){
                deleteElementByValueAndIndex(currentNode.data, index);
            } else
                arrayListIntermediate.add((Integer) currentNode.data);
            index++;
            currentNode = currentNode.nextElement;
        }
    }

    public int sizeOfTheLinkedList(){
        int length = 0;
        Node currentNode = this.headNode;

        while (currentNode != null){
            length++;
            currentNode = currentNode.nextElement;
        }
        return length;
    }
}

public class NthTermFromTheLastInLinkedList {
    public static <Integer> Integer nthElementFromLast(SinglyLinkedList5<Integer> singlyLinkedList5, int indexFromLast){
        Integer requiredVariable = null;
        int sizeOfLinkedList = singlyLinkedList5.sizeOfTheLinkedList();

        if (sizeOfLinkedList == 0 || indexFromLast > sizeOfLinkedList)
            return null;

        int indexFromStart = sizeOfLinkedList - indexFromLast + 1;
        SinglyLinkedList5.Node currentNode = singlyLinkedList5.getHeadNode();
        int intermediateCount = 0;
        while (currentNode != null){
            if(intermediateCount == indexFromStart)
                requiredVariable = (Integer) currentNode.data;

            currentNode = currentNode.nextElement;
        }
        return requiredVariable;
    }

    public static void main(String[] args) {
        SinglyLinkedList5 singlyLinkedList5 = new SinglyLinkedList5();

        for (int i = 0; i < 15; i++){
            singlyLinkedList5.insertDataAtTheEnd(i + 1);
        }
        nthElementFromLast(singlyLinkedList5,5);
    }
}
