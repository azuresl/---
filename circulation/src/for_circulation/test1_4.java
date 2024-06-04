package for_circulation;
// 求和，获取范围中符合要求的数据
// 循环要和其他语句结合使用
// 比如：求1-100之间的偶数和
public class test1_4 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            if (i%2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
