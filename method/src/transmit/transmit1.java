package transmit;

public class transmit1 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("方法调用前:" + number);
        number = change(number);
        System.out.println("方法调用后:" + number);
    }
    public static int change(int number) {
        number = 200;
        // 如果不返回，依旧是100
        return number;
    }
}
