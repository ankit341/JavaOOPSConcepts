package ArrayProblems;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingNumberHashMap {
    public static int findFirstUnique(int[] arr)
    {
        int result = 0;
        Map<Integer,Integer> hashMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(hashMap.containsKey(arr[i])) {
                int occurence = hashMap.get(arr[i]) + 1;
                hashMap.put(arr[i], occurence);
            }
            else
                hashMap.put(arr[i],0);
        }
        System.out.println(hashMap.toString());

        for (int i = 0; i < arr.length; i++){
            if (hashMap.get(arr[i]) == 0){
                result = arr[i];
                break;
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        int[] arrayArgument = new int[]{1,1,1,2,4,5,5,5,5,5,5};

        System.out.println(findFirstUnique(arrayArgument));
    }

}