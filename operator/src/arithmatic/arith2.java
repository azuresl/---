package arithmatic;
// 隐式转换（自动类型提升）：取值范围小的->取值范围大的
// 强制转换：取值范围大的->取值范围小的
public class arith2 {
    public static void main(String[] args) {
        int a = 10;
        double b = 11.1;
        System.out.println(a+b);

        int c = 5;
        double d = 5.0;
        System.out.println(c+d);
    }
}
