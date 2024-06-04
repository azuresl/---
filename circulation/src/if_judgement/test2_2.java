package if_judgement;
import java.util.Scanner;
// 某影院售卖了100张票，序号为1-100
// 奇数票号坐左边，偶数票号坐右边
// 录入票号，并打印位置
public class test2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你的票号");
        int num = sc.nextInt();
        if(num <= 100 && num > 0) {


            if (num % 2 == 1) {
                System.out.println("坐左边");
            } else {
                System.out.println("坐右边");
            }
        } else{
            System.out.println("错票");
        }
    }
}
