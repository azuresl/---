import java.util.Random;
public class test2 {
    // 生成10个1-100之间的随机数存入数组
    // 求所有数据的和
    // 求所有数据的平均数
    // 统计有多少个数据比平均数小
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        // 每循环一次生成一个新的随机数
        for(int i =0;i<arr.length;i++){
            int n = r.nextInt(100)+1;
            arr[i]=n;
            // 遍历数组验证
            System.out.print(arr[i]+" ");
        }
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("合为"+sum);
        int mean = sum/arr.length;
        System.out.println("平均数为"+mean);
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(mean>arr[i]){
                count++;
            }
        }
        System.out.println("有"+count+"个数比平均值小");

    }
}
