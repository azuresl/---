package arithmatic;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        // 左到右
        System.out.println(n / 100);
        n = n % 100;
        System.out.println(n / 10);
        n = n % 10;
        System.out.println(n);

        // 右到左
        int i = sc.nextInt();
        int i1 = 100;
        System.out.println(i % 10);
        System.out.println(i / 10 % 10);
        System.out.println(i / 100 % 10);
    }
}

