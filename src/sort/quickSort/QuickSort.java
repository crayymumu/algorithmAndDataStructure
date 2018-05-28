package sort.quickSort;

import java.util.Arrays;

/**
*@param:
*@Description:快速排序
*@Date:13:51 2018/5/28
*/
public class QuickSort {

    private static int count = 0;

    public static int[] quickSort(int[] a){
        int[] b = a.clone();
        quickSort(b,0,a.length-1);
        return b;
    }

    public static void quickSort(int[]a ,int begin,int end){
        int tBegin = begin,tEnd = end;
        // 将第一个值作为快排序的分界值
        int pivot = a[begin];
        // 在每一次循环结束，并将分界值赋于分界点时，数据就完成了一次大数小数分别列与分界值左右的过程
        while (tBegin<tEnd){
            // 如果当前起始遍历点比最终点大则结束遍历
            // 从最终点往前搜寻比分界值小的数组值，找到后结束遍历
            while (tBegin<tEnd && a[tEnd]>=pivot){
                --tEnd;
            }
            // 因为分界值已经赋于了pivot所以这里可以直接赋值，相当于将小于数组值的数直接放到分界值的左侧
            // 如果上述搜寻由始至终尚未找到比分界值小的值，则最终会遍历到分界值本身即tBegin=tEnd，并将分界值本身赋值给分界值
            a[tBegin] = a[tEnd];
            // 如果当前起始遍历点比最终点大则结束遍历
            // 从起点到上面遍历到的终点，然后往后搜寻比分界值大的数组值，找到后结束遍历
            while (tBegin<tEnd && a[tBegin]<=pivot){
                ++tBegin;
            }
            //正因为之前代码里已经将比分界值小的数分配至分界值左侧，所以上述遍历指向的数组位可以被赋值覆盖
            // 如果找不到比分界值大的，则最终会因为tBegin=tEnd而导致结束遍历，并将分界值本身赋值给分界值
            a[tEnd] = a[tBegin];
        }
        //将分界值分配到，从前面遍历和从后面遍历的交点所在的数组位置
        a[tBegin] = pivot;

        /**
        *因为数组中的每一个值都会被当成分界值执行上述的循环，所以count的值刚好等于数组中值的个数
        *
        *
        */
//        ++count;
//        System.out.println(count);
//        System.out.println(Arrays.toString(a));
        //将分界值前面那一块重新执行一次分配，递归直到只剩下最后一个值无法进行大值小值在分界值左右分配即begin = tEnd
        if(begin<tEnd) {
            quickSort(a,begin,tEnd-1);
        }
        //同理对后面那一块继续分配,直到tBegin=end，最终完成排序
        if(tBegin<end) {
            quickSort(a,tBegin+1,end);
        }
    }
}
