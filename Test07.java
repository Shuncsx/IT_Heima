public class Test07 {
    //定义一个数组其中包含多个数字。用自己的方式最终实现，
    //奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 8, 5, 6, 12, 13, 11, 17};
        int[] arr2 = new int[arr1.length];
        int left = 0;
        int right = arr1.length - 1;
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr2[left] = arr1[i];
                left++;
            } else {
                arr2[right] = arr1[i];
                right--;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }


    }


}
