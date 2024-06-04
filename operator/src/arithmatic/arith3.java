package arithmatic;
// 隐式转换（自动类型提升）：取值范围小的->取值范围大的
// 强制转换：取值范围大的->取值范围小的
public class arith3 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        byte result = (byte)(b1 + b2);
        System.out.println(result);
    }
}
