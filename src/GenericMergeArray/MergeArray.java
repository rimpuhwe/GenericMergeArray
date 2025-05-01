package GenericMergeArray;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3};
        Integer[] arr2 = {8,9,10};
        System.out.println(Arrays.toString(mergeArrays(arr1 , arr2))); ;


    }
    public static <T> T[] mergeArrays(T[] a, T[] b){
        /**
         * this function takes to arrays of same datatypes which is unknown and merge them together.
         * in this case, you use this function when you want to achieve one array which combines
         * both of the two arrays inputted.
         */
        int i = a.length + b.length;
        int x = 0;

        T[] c = new <T>[i];
        for(int j = 0; j < i; j++){
            if(j > a.length -1){
                c[j] = b[x];
                x++;

            }
            else{
                c[j] = a[j];
            }
        }
        return Arrays.copyOf(c, i);
    }
}
