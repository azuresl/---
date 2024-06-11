package fomat;

public class test2_1 {
    // 定义一个方法，求长方形的周长，将结果在方法中打印
    public static void main(String[] args) {
        perimeter(15.2,1.3);
    }
    public static void perimeter(double len,double width){
        double peri = (len + width) * 2;
        System.out.println(peri);
    }
}
