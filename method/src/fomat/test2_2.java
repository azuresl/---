package fomat;

public class test2_2 {
    // 定义一个方法，求圆的面积，将结果在方法中打印
    public static void main(String[] args) {
        area(1.5);
    }
    public static void area(double r){
        double area = Math.PI*r*r;
        System.out.println(area);
    }
}
