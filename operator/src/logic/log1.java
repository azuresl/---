package logic;

public class log1 {
    public static void main(String[] args) {
        System.out.println("%");
        //  & 两边都为真，结果才是真
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & false);
        System.out.println(false & true);

        System.out.println("|");
        //  ｜ 两边都为假，结果才是假
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | false);
        System.out.println(false | true);

        //  ^ 相同为false，不同为true
        //  ! 取反 （只写一次）
    }
}
