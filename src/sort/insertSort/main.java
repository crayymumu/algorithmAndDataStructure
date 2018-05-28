package sort.insertSort;

import java.util.Arrays;

public class main {

    public static void main(String[] args){
        int[] a = {7,6,5,11,12,13,14};
        int[] b = InsertSort.insertSort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
