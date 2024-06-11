public class test3_3 {
    public static void main(String[] args) {
        // 定义一个数组，存储1-10
        // 遍历数组得到每一个数
        // 如果是奇数，将当前数字扩大两倍
        // 如果是偶数，将当前数字变成1/2
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 ==1){
                arr[i] = 2 * arr[i];
            }else{
                arr[i] = arr[i] / 2;
            }
        }
        // 一个循环尽量只做一件事，覆盖之后重新遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
