package reload;
public class test1 {
    // 使用方法重载，设计比较两个整数是否相同的方法
    // 要求：兼容全整数类型（byte，short，int，long）
    public static void main(String[] args) {
        // 可以强转，改变类型
        compare((byte)10,(byte)20);
        // 另一种转换格式
        // byte b1 = 10;
        // byte b2 = 20;
        // compare(b1,b2)
    }
        public static void compare(int num1 , int num2){
            System.out.println(num1 == num2);
            System.out.println("int");
        }
        public static void compare(long num1 , long num2){
        System.out.println(num1 == num2);
            System.out.println("long");
        }
        public static void compare(short num1 , short num2){
        System.out.println(num1 == num2);
            System.out.println("short");
        }
        public static void compare(byte num1 , byte num2){
        System.out.println(num1 == num2);
            System.out.println("byte");
        }
}
