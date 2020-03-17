package ArrayProblems;

import java.util.Arrays;

public class ProductOfArrayElementsExceptItself {
    public static int[] findProductBruteForce(int[] arrayArgument){
        int[] result = new int[arrayArgument.length];
        for(int iCounter = 0; iCounter < arrayArgument.length; iCounter++){
            int sum = 1;
                for (int jCounter = 0; jCounter < arrayArgument.length; jCounter++){
                    if (arrayArgument[jCounter] ==0 && arrayArgument[iCounter] == 0)
                        continue;
                    else
                        sum = sum * arrayArgument[jCounter];
                }
                if (arrayArgument[iCounter] == 0)
                    result[iCounter] = sum;
                else
                    result[iCounter] = sum/arrayArgument[iCounter];
            }
        return result;
    }

    public static int[] findProductLessComplexity(int[] arrayArgument){
        int result[] = new int[arrayArgument.length];
        int tempVariable = 1;

        for(int j = 0; j < arrayArgument.length; j++){
            result[j] = 1;
        }
        System.out.println(Arrays.toString(result));

        for (int i=0; i < arrayArgument.length; i++){
            result[i] = tempVariable;
            tempVariable *= arrayArgument[i];
        }
        tempVariable = 1;

        for (int i=arrayArgument.length -1; i>=0; i--){
            result[i] *= tempVariable;
            tempVariable *= arrayArgument[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arrayArgument = new int[]{0,2,3,4,5};
        System.out.println(Arrays.toString(findProductBruteForce(arrayArgument)));
        System.out.println(Arrays.toString(findProductLessComplexity(arrayArgument)));
    }

}
