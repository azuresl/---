package assigning;

public class assign1 {
    public static void main(String[] args) {
        // += 左右相加赋值给左，等同于a = (int)(a + b)
        int a= 10;
        int b= 20;
        a += b ;
        System.out.println(a);
        System.out.println(b);

        // 底层隐藏了一个强制类型转换
        short s = 1;
        s += 1;
        //等同于s = (short) (s + 1)
        System.out.println(s);
    }
}
