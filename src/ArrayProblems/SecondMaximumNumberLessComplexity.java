package ArrayProblems;

public class SecondMaximumNumberLessComplexity {
    public static int findSecondMaximum(int[] arr)
    {
        int result = 0;
        int maxNumber = Integer.MIN_VALUE, secondMaxNumber = Integer.MIN_VALUE;

        for (int i = 0; i <arr.length; i++){
            if(arr[i] > maxNumber)
                maxNumber = arr[i];
        }

        for(int i = 0; i <arr.length; i++){
            if (arr[i] == maxNumber)
                continue;
            else {
                if (arr[i] > secondMaxNumber) {
                    secondMaxNumber = arr[i];
                }
            }
        }
        result = secondMaxNumber;
        return result;
    }

    public static void main(String[] args) {
        int[] arrayArgument = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(findSecondMaximum(arrayArgument));
    }
}
