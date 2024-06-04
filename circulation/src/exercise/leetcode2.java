package exercise;
// 给定两个整数，被除数和除数(都是正数，且不超过int的范围)
// 将两数相除，要求不使用乘法、除法和%运算符，得到商和余数
public class leetcode2 {
    public static void main(String[] args) {
        int a = 100;
        int b = 37;
        int count = 0;
        while (a >= b) {
            a = a - b;
            count ++;
        }
        System.out.println(count);
        System.out.println(a);
    }
}
