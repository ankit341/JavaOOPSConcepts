package ArrayProblems;

public class FirstNonRepeatingNumber {

    public static int partition(int[] arr, int lowIndex, int highIndex) {
        int lowerIndexReference = lowIndex -1;
        int pivotElement = arr[highIndex];

        for(int iCounter = lowIndex; iCounter < highIndex; iCounter++){
            if(pivotElement > arr[iCounter]) {
                lowerIndexReference++;

                int temp = arr[lowerIndexReference];
                arr[lowerIndexReference] = arr[iCounter];
                arr[iCounter] = temp;
            }
        }
        int temp = arr[highIndex];
        arr[highIndex] = arr[lowerIndexReference + 1];
        arr[lowerIndexReference + 1] = temp;

        return lowerIndexReference+1;
    }

    public static void quickSort(int arr[], int lowIndex, int highIndex){
        if(lowIndex < highIndex) {
            int partitionVariable = partition(arr, lowIndex, highIndex);

            quickSort(arr, lowIndex, partitionVariable - 1);
            quickSort(arr, partitionVariable + 1, highIndex);
        }
    }

    public static int findFirstUnique(int[] arr)
    {
        int result = 0;
        int tempVariable = arr[0];
        int countOfOccurence = 1;
        int lowIndex = 0, highIndex = arr.length - 1;

        while (lowIndex < highIndex){
           lowIndex++;
           if(arr[lowIndex] != tempVariable && countOfOccurence == 1){
               result = tempVariable;
               break;
           }
           if(countOfOccurence > 1 && arr[lowIndex] != tempVariable ) {
               tempVariable = arr[lowIndex];
               countOfOccurence = 0;
           }
            countOfOccurence++;
           }
           if(countOfOccurence == 1 && lowIndex == highIndex)
               result = tempVariable;
        return result;
    }

    public static void main(String[] args) {
        int[] arrayArgument = new int[]{1,1,1,4,4,5,5,5,5,5,5,6,6,6,6,6,7};
        int lowIndex = 0, highIndex = arrayArgument.length;
        quickSort(arrayArgument,lowIndex,highIndex -1);
        System.out.println(findFirstUnique(arrayArgument));
    }
}