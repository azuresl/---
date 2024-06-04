package for_circulation;
import java.util.Scanner;
// 录入两个数字，表示一个范围
// 统计这个范围中，既能被3整除，又能被5整除的数字有多少个
public class test1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数字表示范围的开始");
        int num1 = sc.nextInt();
        System.out.println("输入第二个数字表示范围的结束");
        int num2 = sc.nextInt();
        int num3= 0;
        for (int i = num1; i < num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                num3 += 1;
            }
        }
        System.out.println(num3);
    }
}
