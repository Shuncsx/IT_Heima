public class Task04 {
    public static void main(String[] args) {
       /* 现有一个整数数组，数组中的每个元素都是[0-9]之间的数字，
          从数组的最大索引位置开始到最小索引位置，
          依次表示整数的个位、十位、百位。。。依次类推。
          请编写程序计算，这个数组所表示的整数值*/
        //{2,3,5,1,4} -- 23514

        //1.定义数组
        int arr[] = {2,3,5,1,4};
        int a = 0;
        for (int i = 0; i <=arr.length-1; i++) {
           a= a*10+arr[i];

        }
        System.out.println(a);






    }
}
