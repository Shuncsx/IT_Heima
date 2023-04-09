import java.util.Scanner;
//有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
// 再通过键盘录入一个整数数字。要求：把数字放入数组序列中，
// 生成一个新的数组，并且数组的元素依旧是从小到大排列的。执行效果如下
public class Task06 {
    public static void main(String[] args) {
        int[] arr1 = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int index = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//16
        //定义新数组arr2
        int[] arr2 = new int[arr1.length+1];

        //判断并赋值给新数组
        //小于或等于num的元素直接存放到原来的位置
        // 大于num的元素往后移动一个位置,并记录此索引
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] <= n) {
                arr2[i] = arr1[i];
                index = i + 1; //2索引
            } else {
                arr2[i + 1] = arr1[i];
            }
        }
        arr2[index] = n;
        //遍历新数组
        for (int p = 0; p < arr2.length; p++) {
            System.out.print(arr2[p]+" ");
        }
    }
}
