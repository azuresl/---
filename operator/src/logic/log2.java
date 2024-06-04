package logic;

public class log2 {
    public static void main(String[] args) {
        //  &&  短路逻辑运算符 若左边能确定整个的结果，右边不执行
        //  两边都真结果才真  左false 直接false
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(result);

        //  ||  短路逻辑运算符 若左边能确定整个的结果，右边不执行
        //  两边都假结果才假  左true 直接true

        // && || ! 最常用

    }
}
