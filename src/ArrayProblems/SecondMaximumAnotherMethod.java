package ArrayProblems;

public class SecondMaximumAnotherMethod {
    public static int findSecondMaximum(int arr[]){
        int result = 0, maxNumber = Integer.MIN_VALUE, secondMaxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxNumber){
                secondMaxNumber = maxNumber;
                maxNumber = arr[i];
            } else if (arr[i] > secondMaxNumber && arr[i] != maxNumber)
                secondMaxNumber = arr[i];
        }
        result = secondMaxNumber;
        return result;
    }
    public static void main(String[] args) {
        int[] arrayArgument = new int[]{11,1,2,3,4,5,6,7,8,9};
        System.out.println(findSecondMaximum(arrayArgument));
    }
}
