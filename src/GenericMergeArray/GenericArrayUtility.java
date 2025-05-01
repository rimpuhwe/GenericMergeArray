package GenericMergeArray;

import java.util.Arrays;

public class GenericArrayUtility {
    /**
     * this function takes to arrays of same <code>T</code> datatypes which is unknown and merge them together.
     * In this case, you use this function when you want to achieve one array which combines
     * both of the two arrays inputted.<br><br>
     * To create a new array with length of combined array use:
     * <code>
     *      @return
     *      T[] c;
     *     @SuppressWarnings("unchecked"):
     *     T[] c = (T[]) java.lang.reflect.Array.newInstance(arrayName.getClass().getComponentType(), array1.length + array2.length);
     * </code>
     *
     */
    public static <T> T[] mergeArrays(T[] a, T[] b){

        int i = a.length + b.length;
        int x = 0;
        @SuppressWarnings("unchecked")
        T[] c = (T[]) java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), a.length + b.length);

        if(a.length == 0 && b.length == 0){
            return c;
        }
        else if(a.length == 0){
            return Arrays.copyOf(b,b.length);
        }
        else if(b.length == 0){
            return Arrays.copyOf(a,a.length);
        }
        else{
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
}
