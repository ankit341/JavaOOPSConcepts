package LinkedListProblems;

import java.util.ArrayList;

class SinglyLinkedList4<Integer>{
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

    public SinglyLinkedList4(){
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
}
public class InterSectionAndUnionOfLinkedList {
    public static <Integer> SinglyLinkedList4<Integer> union(SinglyLinkedList4<Integer> list1, SinglyLinkedList4<Integer> list2){
        SinglyLinkedList4<Integer>.Node currentNodeList1 = list1.getHeadNode();
        SinglyLinkedList4<Integer>.Node currentNodeList2 = list2.getHeadNode();

        list1.removeDuplicates();
        list2.removeDuplicates();

        while (currentNodeList1.nextElement != null){
            currentNodeList1 = currentNodeList1.nextElement;
        }
        currentNodeList1.nextElement = currentNodeList2;
        list1.removeDuplicates();
        return list1;
    }

    public static <Integer> SinglyLinkedList4<Integer> intersection(SinglyLinkedList4<Integer> list1, SinglyLinkedList4<Integer> list2){
        SinglyLinkedList4<Integer>.Node currentNodeList1 = list1.getHeadNode();
        SinglyLinkedList4<Integer>.Node currentNodeList2 = list2.getHeadNode();

        list1.removeDuplicates();
        list2.removeDuplicates();

        SinglyLinkedList4<Integer> newLinkedList = new SinglyLinkedList4<Integer>();
        ArrayList<Integer> intermediateArrayList = new ArrayList<Integer>();

        while (currentNodeList1 != null){
            intermediateArrayList.add(currentNodeList1.data);
            currentNodeList1 = currentNodeList1.nextElement;
        }

        while (currentNodeList2 != null) {
            if (intermediateArrayList.contains(currentNodeList2.data)) {
                newLinkedList.insertDataAtTheEnd(currentNodeList2.data);
            }
            currentNodeList2 = currentNodeList2.nextElement;
        }
        return newLinkedList;
    }

    public static void main(String[] args) {
        SinglyLinkedList4 list1 = new SinglyLinkedList4();
        SinglyLinkedList4 list2 = new SinglyLinkedList4();
        for (int i = 0; i < 15; i++){
            list1.insertDataAtTheEnd(i+1);
            list2.insertDataAtTheEnd(i+2);
        }
        System.out.println(union(list1,list2).toString());
        System.out.println(intersection(list1,list2).toString());
    }
}
