package if_judgement;
import java.util.Scanner;
// 用户购买商品总价为600元
// 录入实际支付的钱
// 付款>=600则成功，反之付款失败
public class test2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("付了多少钱");
        int paid = sc.nextInt();
        if (paid >= 600) {
            System.out.println("success");
        } else{ System.out.println("fail");}

    }
}
