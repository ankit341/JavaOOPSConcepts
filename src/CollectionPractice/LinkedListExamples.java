package CollectionPractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExamples {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

//    public static LinkedListExamples(LinkedListExamples linkedListExamples, int data){
//
//    }
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(15);
        linkedList.add(16);
        linkedList.addFirst(14);
        linkedList.addLast(17);


        Integer intArray[] = new Integer[linkedList.size()];
                linkedList.toArray(intArray);

        linkedList.forEach(a -> System.out.println(a));

        System.out.println(intArray.length);

        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");

        System.out.println("Contents of list ::"+list);
        String[] myArray = new String[list.size()];
        list.toArray(myArray);
    }
}
