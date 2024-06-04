package logic;

import java.util.Scanner;
//录入两个整数
//如果其中一个为6，true
//如果和为6的倍数，true
//其他情况false

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入两个整数");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean bool1 = num1==6 || num2==6;
        boolean bool2 = (num1 + num2) % 6 == 0;
        // 或者 num1==6 || num2==6 || (num1 + num2) % 6 == 0
        System.out.println(bool1 || bool2);

    }
}
