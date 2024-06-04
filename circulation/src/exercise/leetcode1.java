package exercise;
// 回文数
// 给你一个整数x。如果x是一个回文整数，打印true，否则返回false。
// 回文数指正序(从左向右)和倒序(从右向左)读都是一样的整数。
public class leetcode1 {
    public static void main(String[] args) {
        int x =1234;
        //定义一个临时变量用来记录x的值
        int temp = x;
        int num = 0;
        while(x != 0){
            int ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;
        }
        System.out.println(num);
        System.out.println(num == temp);
    }
}


