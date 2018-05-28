package sort.shellSort;

public class ShellSort {
    public static int[] shellSort(int[] b){
        int[] a = b.clone();
        //定义步长
        int gap = 1, j, len = a.length;
        int temp;
        while (gap < len / 3) {
            gap = gap * 3 + 1; // <O(n^(3/2)) by Knuth,1973>: 1, 4, 13, 40, 121, ...
        }
        for (; gap > 0; gap /= 3) {
            for (int i = gap; i < len; i++) {
                temp = a[i];
                for (j = i - gap; j >= 0 && a[j] > temp; j -= gap) {
                    a[j + gap] = a[j];
                }
                a[j + gap] = temp;
            }
        }
        return a;
    }

}
