package sort;

import array.LinkedList;

import java.util.Arrays;

/**
 * description: 冒泡排序
 * Author	Date	Changes
 * fengy  2020/10/26 Created
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 1, 3, 2};
        sort(array);
        System.out.println(Arrays.toString(array));
        LinkedList link = new LinkedList();
        link.insertTail(4);
        link.insertTail(5);
        link.insertTail(6);
        link.insertTail(1);
        link.insertTail(3);
        link.insertTail(2);
        link.insertTail(4);
        link.printAll();
        sortLinked(link);
        link.printAll();
    }

    private static void sortLinked(LinkedList link) {
        for (LinkedList.Node i = link.head; i != null; i = i.getNext()) {
//            boolean flag = false;
//            for (int j = 0; j < array.length - i - 1; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                    flag = true;
//                }
//            }
//            if (!flag) {
//                break;
//            }
        }
    }

    public static void sort(int[] array) {
        /*冒泡排序只会操作相邻的两个数据。每次冒泡操作都会对相邻的两个元素进行比较，
        看是否满足大小关系要求。如果不满足就让它俩互换。一次冒泡会让至少一个元素移动到它应该在的位置，
        重复 n 次，就完成了 n 个数据的排序工作。*/
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

}
