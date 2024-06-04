package if_judgement;
import java.util.Scanner;
// 商品价格为1000
// 录入会员级别，根据会员等级打不同的折
// 1级打九折
// 2级打八折
// 3级打七折
// 非会员不打折
public class test3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员等级");
        int Class = sc.nextInt();
        System.out.println("您需要支付的价格为");
        if(Class == 1){
            System.out.println("900");
        }else if(Class == 2){
            System.out.println("800");
        }else if(Class == 3){
            System.out.println("700");
        }else{
            System.out.println("1000");
        }



    }
}
