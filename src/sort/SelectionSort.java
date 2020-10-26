package sort;

import java.util.Arrays;

/**
 * description: 选择排序
 * Author	Date	Changes
 * fengy  2020/10/26 Created
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 1, 3, 2};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        /*选择排序算法的实现思路有点类似插入排序，
        也分已排序区间和未排序区间。
        但是选择排序每次会从未排序区间中找到最小的元素，
        将其放到已排序区间的末尾。*/

        for (int i = 0; i < array.length-1; i++) {
            int min=i;
            for (int j = i+1; j < array.length; j++) {
                if (array[min]>array[j]){
                    min=j;
                }
            }
            int temp = array[i];
            array[i]=array[min];
            array[min]=temp;
        }
    }

}
