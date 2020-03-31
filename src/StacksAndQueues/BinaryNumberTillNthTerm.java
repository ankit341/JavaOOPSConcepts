package StacksAndQueues;

import java.util.Arrays;

public class BinaryNumberTillNthTerm<Integer> {

    public static String DecimalToBinaryNumber(int number){
        String binaryNumber = "";
        while (number != 1){
            if (number % 2 == 0)
                binaryNumber += "0";
            else
                binaryNumber += "1";
            number = number/2;
        }
        binaryNumber = "1" + binaryNumber;
        return binaryNumber;
    }

    public static String[] findBin(int number) {
        String[] intermediateArray = new String[number];
        QueuesBasicOperation<String> queuesBasicOperation = new QueuesBasicOperation(number);

        queuesBasicOperation.enqueue("1");

        for (int i = 0; i < number; i++){
            intermediateArray[i] = queuesBasicOperation.dequeue();
            String sequence1 = intermediateArray[i] + "0";
            String sequence2 = intermediateArray[i] + "1";
            queuesBasicOperation.enqueue(sequence1);
            queuesBasicOperation.enqueue(sequence2);
        }

        return intermediateArray;
    }

    public static void main(String[] args) {
        System.out.println(DecimalToBinaryNumber(15));

        String[] resultantArray = findBin(4);
        System.out.println(Arrays.toString(resultantArray));
    }
}
