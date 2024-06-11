import java.util.Random;

public class test4 {
    // 定义一个数组，存入1-5
    // 打乱数组中所有数据的顺序
    public static void main(String[] args) {
        // 难点：如何获取数据中的随机索引
        int[] arr = {1,2,3,4,5};
        // 索引范围：0 1 2 3 4
        // Random r = new Random();
        // int number = r.nextInt(arr.length);
        // System.out.println(number);
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[num];
            arr[num] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
