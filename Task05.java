public class Task05 {
    public static void main(String[] args) {
        //定义一个数组来存储10个学生的成绩，
        // 例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。
        // 计算并输出学生的平均成绩。
        int arr [] = {1,2,2,10,10};
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
              sum += arr[i];
        }
     double end = sum/ arr.length;
        System.out.println(end);


    }

}
