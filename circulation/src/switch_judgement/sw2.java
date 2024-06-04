package switch_judgement;
// 1.default的位置和省略
//   不一定要写在最下面，可以省略，不会影响语法（最好都别）

// 2.case穿透
//   break省略的话，匹配上了不会停止，会继续执行下一个case的语句体
//   一直到遇到break或者大括号才会停下（顺序是从上往下穿透）

// 3.if和switch的第三种格式的使用场景
//   if：一般用于对范围的判断
//   switch：把有限个数据一一列举，任选其一

import java.util.Scanner;

public class sw2 {
    public static void main(String[] args) {
        // 录入星期数，输出工作日、休息日
        // 1-5工作日，6-7休息日

        Scanner sc = new Scanner(System.in);
        System.out.println("今天周几？");
        int week = sc.nextInt();
        switch(week){
            // 也可以写成 case 1,2,3,4,5:
            // System.out.println("工作日");
            // break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
        }
    }
}
