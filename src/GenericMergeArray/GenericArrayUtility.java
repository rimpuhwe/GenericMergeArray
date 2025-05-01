package GenericMergeArray;

import java.util.Arrays;

public class GenericArrayUtility {
    /**
     * this function takes to arrays of same <T> datatypes which is unknown and merge them together.
     * In this case, you use this function when you want to achieve one array which combines
     * both of the two arrays inputted.
     */
    public static <T> T[] mergeArrays(T[] a, T[] b){

        int i = a.length + b.length;
        int x = 0;

        T[] c = new T [i];
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
