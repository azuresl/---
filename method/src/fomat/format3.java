package fomat;

public class format3 {
    // 带返回值方法的定义和调用
    // 方法的返回值就是方法运行的最终结果
    public static void main(String[] args) {
        // 定义一个方法，求一家商场每个季度的营业额
        // 根据方法结果计算出全年营业额

        // 直接调用
        // sale(10,20,30);
        // 赋值调用
        // int sum = sale(10,20,30);
        // 输出调用
        // System.out.println(sale(10,20,30));

        int sum1 = sale(10,20,30);
        int sum2 = sale(20,30,40);
        int sum3 = sale(30,40,50);
        int sum4 = sale(40,50,60);

        int sum = sum1 + sum2 + sum3 + sum4;
        System.out.println(sum);
    }
    public static int sale(int num1, int num2, int num3){
        int result = num1 + num2 + num3;
        return result;
    }
}
