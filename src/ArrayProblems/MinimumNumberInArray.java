package ArrayProblems;

public class MinimumNumberInArray {
    public static int findMinimumNumberInArray(int[] arrayArgument){
        int minimumNumber = arrayArgument[0];
        int index = 0;
        while (index < arrayArgument.length ){
            if(minimumNumber > arrayArgument[index])
                minimumNumber = arrayArgument[index];
            index++;
        }
        return minimumNumber;
    }

    public static void main(String[] args) {
        int[] arrayArgument = new int[]{1,2,3,4,0,99};
        System.out.println(findMinimumNumberInArray(arrayArgument));
    }
}
