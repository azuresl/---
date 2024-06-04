package arithmatic;
public class arith1 {
    public static void main(String[] args) {
        System.out.println("加减乘");

        System.out.println(3 +2);
        System.out.println(5-1);
        System.out.println(7 * 9);

        // 在代码中如果有小数参与计算，结果可能不精确
        System.out.println(1.1 + 1.1);
        System.out.println(1.1 + 1.01);
        System.out.println(1.1-1.01);
        System.out.println(1.1 * 1.1);

        System.out.println("除和取模");

        // 整数参与计算，只能得到整数
        System.out.println(10 / 2);
        System.out.println(10 / 3);
        System.out.println(10.0 / 3);
        System.out.println(10 % 3);
    }
}
