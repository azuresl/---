package exercise;
import java.util.Random;
// 设计一个方法用于数组遍历
// 要求遍历的结果在一行上
// 例如[11，22，33，44，55]
public class exercise1 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        result1(arr);
        System.out.println("-----------");
        // 随机生成
        Random rand = new Random();
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            int number = rand.nextInt(100);
            arr1[i] = number;
        }
        result2(arr1);
    }
    public static void result1(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
    // 随机生成
    public static void result2(int[] arr1){

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }


    }
}
