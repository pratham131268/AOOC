import java.util.Arrays;

public class MergeArrays{
    public static void main(String[] args){
        int[] arr1 = {3,6,9};
        int[] arr2 = {2,4,7};
        int[] merged = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;
        while(i < arr1.length && j < arr2.length)
            merged[k++] = (arr1[i] < arr2[j]) ? arr1[i++] : arr2[j++];
        while(i < arr1.length)
            merged[k++] = arr1[i++];

        while(j < arr2.length)
            merged[k++] = arr2[j++];

        System.out.println("Merged: "+ Arrays.toString(merged));
    }
}
