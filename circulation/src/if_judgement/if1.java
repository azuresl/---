package if_judgement;
import java.util.Scanner;
//  录入数字，如果大于2，给出回应，反之不回应
public class if1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int n = sc.nextInt();

      //  if(条件){
      //    语句体；
      //   }

        if(n > 2){
            System.out.println("good");
            //布尔类型的变量进行判断，直接写
        }
        boolean flag = false;
        if(flag){
            System.out.println("nice");
        }
    }
}
