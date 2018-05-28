package sort.insertSort;

/**
*@param:
*@Description:插入排序
*@Date:13:50 2018/5/28
*/
public class InsertSort {

    /**
    *@param:
    *@Description:直接插入排序，方式一
    *@Date:14:01 2018/5/28
    */
    public static int[] insertSort(int b[]){
        int[] a = b.clone();
        for(int i=1;i<a.length;i++){
            //如果需要比较的值比该值小则执行下面的操作，反之则直接进行下一次循环，将该值的位置不变
            if(a[i]<a[i-1]){
                //将空位置进行保存
                int j = i-1;
                //将要重新安排位置的数值进行保存
                int x = a[i];
                //将值后移一位并腾出一格空位
                a[i] = a[i-1];
                //通过比较寻找一格可以有序安置x的位置
                while(x < a[j]){
                    //将比x大的值位置向右偏移
                    a[j+1] = a[j];
                    --j;
                    //如果j<-1则说明数组已经是最右边了，没有比x更小的值了，那么说明a[0]应当为x
                    if(j == -1){
                        break;
                    }
                }
                //将值有序安排
                a[j+1] = x;
            }
        }
        return a;
    }

    /**
    *@param:
    *@Description:插入排序，方式二
    *@Date:15:09 2018/5/28
    */
    public static int[] insertSort2(int b[]){
        int[] a = b.clone();
        return a;
    }

}
