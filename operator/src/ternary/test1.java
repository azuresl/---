package ternary;
// 录入两只老虎的体重，判断是否相同

import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两只老虎的体重");
        int weight1 = sc.nextInt();
        int weight2 = sc.nextInt();
        String result = weight1 == weight2 ? "相同" : "不同";
        System.out.println(result);

    }
}
