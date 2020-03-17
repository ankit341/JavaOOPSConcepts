package CollectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();

        List<Double> list = new ArrayList<Double>(10);

        System.out.println("inside the class");
        int i = 0;

        for (i = 0; i < 10; i++){
            arrayList.add(Math.pow(i,i));
        }

        for (Double d: arrayList){
            System.out.println(d);
        }

        arrayList.forEach(aDouble -> System.out.println(aDouble));

        System.out.println(arrayList.lastIndexOf(20));

        list = (List<Double>) arrayList.clone();

        list.forEach(a -> System.out.println(a));

        list.add(3,3000d);

    }
}
