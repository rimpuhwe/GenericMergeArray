package GenericMergeArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3};
        Integer[] arr2 = {5,6};
        Integer[] result =  GenericArrayUtility.mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));


    }

}
