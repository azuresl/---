package incre_decre;

public class in_de {
    public static void main(String[] args) {
        //单独写一行，++a = a++
        int a= 10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);

        //先用后加,先赋值给左，再自己加1
        int b = 10;
        int c = b++;
        System.out.println(c);
        System.out.println(b);

        //先加后用，先自己加1，再赋值给左
        int d = 10;
        int e = ++d;
        System.out.println(e);

    }
}
