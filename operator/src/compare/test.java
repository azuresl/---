package compare;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您衣服的时髦程度");
        int a = sc.nextInt();
        System.out.println("请输入相亲对象衣服的时髦程度");
        int b = sc.nextInt();
        System.out.println(a > b);
    }
}
