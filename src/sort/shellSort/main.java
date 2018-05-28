package sort.shellSort;

import java.util.Arrays;

public class main {
    public static void main(String[] args){
        int[] a = {7,6,5,112,11,13,14,7,6,5,112,11,13,14,7,6,5,112,11,13,14,7,6,5,112,11,13,14};
        int[] b = ShellSort.shellSort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
