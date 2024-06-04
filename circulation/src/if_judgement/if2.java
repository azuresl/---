package if_judgement;
import java.util.Scanner;
// 录入身上的钱，>=100就去a店，否则去b店
public class if2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("your money");
        int money = sc.nextInt();
        if (money >= 100) {
            System.out.println("go to a");
        } else {
            System.out.println("go to b");
        }

    }
}
