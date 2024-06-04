package ternary;

public class ter {
    public static void main(String[] args) {
        // 格式：关系表达式？表达式1:表达式2；真则1，假则2
        // 结果必须要被使用
        int num1 = 10;
        int num2 = 20;
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);


    }
}
