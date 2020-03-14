package Encapsulation;

import java.io.Serializable;
import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[][] twoDimensionalArray = new int[10][];

        for (int i = 0; i < 10; i++){
            twoDimensionalArray[i] = new int[10];
            for (int j = 0 ; j < 10; j++){
                twoDimensionalArray[i][j] = i + j;
                System.out.println(twoDimensionalArray[i][j]);
            }
        }
    }
}
