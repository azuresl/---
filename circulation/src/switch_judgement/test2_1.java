package switch_judgement;

import java.util.Scanner;

// 拨打机票预定电话，语音提示：
// 1机票查询，2机票预订，3机票改签
// 4提出服务，其他按钮也是退出服务
public class test2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("按键选择服务");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预订");
                break;
            case 3:
                System.out.println("机票改签");
                break;
            case 4:
                System.out.println("退出服务");
                break;
            default:
                System.out.println("退出服务");
                break;
        }


    }
}
