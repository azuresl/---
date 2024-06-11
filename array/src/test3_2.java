public class test3_2 {
    public static void main(String[] args) {
        // 定义一个数组，存储1-10
        // 遍历得到每一个元素
        // 统计数组中一共多少个元素能被3整除
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            if(arr[i] % 3 == 0){
                count ++;
            }
        }
        System.out.println("被3整除的数字有");
        System.out.println(count);
    }
}
