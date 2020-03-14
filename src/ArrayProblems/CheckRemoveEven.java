package ArrayProblems;

class CheckRemoveEven {

    public static int[] removeEven(int[] arr) {
        System.out.println("inside the remove array");
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++){
//           System.out.println("inside the outer for loop");
            if (arr[i] % 2 ==0 ){
                for (int j= i ; j < arr.length; j++){
//                    System.out.println("inside the inner for loop");
                    arr[j-1] = arr[j];
                }
                i--;
            } else
                continue;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] myArray = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("Inside main method");

        System.out.println(removeEven(myArray));
    }
}