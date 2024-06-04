package arithmatic;

import java.util.Scanner;

public class arith4 {
    public static void main(String[] args) {
        //出现字符串时，+为连接符
        //连续进行+操作时，从左到右逐个执行
        System.out.println("123"+123);
        System.out.println(1+99+"hh");
        System.out.println(1+2+"abc"+1+2);

        //
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        System.out.println("ge" + i % 10);
        System.out.println("shi" + i / 10 % 10);
        System.out.println("bai" + i / 100 % 10);

        // char提升方法 A65 a97
        char c = 'a';
        int result = c + 0;
        System.out.println(result);

        System.out.println(1 + 'a');
        System.out.println('a' + "abc" );
    }
}
