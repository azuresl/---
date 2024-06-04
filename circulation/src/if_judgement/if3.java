package if_judgement;
import java.util.Scanner;
// 小明考试成绩对应奖励如下：
// 95-100 一辆自行车
// 90-94 去游乐场玩一天
// 80-89 一个变形金刚
// 80分以下 批评教育
public class if3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("小明考了多少分");
        int points = sc.nextInt();
        if(points >= 0 && points <= 100) {
            if (points <= 100 && points >= 95) {
                System.out.println("bicycle");
            } else if (points >= 90 && points <= 94) {
                System.out.println("amusement park");
            } else if (points >= 80 && points <= 89) {
                System.out.println("Transformers");
            } else {
                System.out.println("criticism and education");
            }
        }else{
            System.out.println("illegal");
        }
    }
}
