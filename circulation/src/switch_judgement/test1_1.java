package switch_judgement;
import java.util.Scanner;
// 录入星期数，显示今天的活动内容
// 周一跑步，周二游泳，周三慢走，周四单车，周五拳击，周六爬山，周日休息
public class test1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("今天周几？");
        int week = sc.nextInt();

        switch (week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("休息");
                break;
        }
    }
}
