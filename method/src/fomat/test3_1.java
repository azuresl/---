package fomat;

public class test3_1 {
    // 定义一个方法，比较两个长方形的面积
    public static void main(String[] args) {
        double area1 = area(20,30);
        double area2 = area(30,40);
        String result  = area1 > area2 ? "第一个面积大":"第二个面积大";
        System.out.println(result);
    }
    // 把重复的代码或者具有独立性的代码抽取到方法当中
    public static double area(double len,double width){
        double area = len * width;
        return area;
    }
}
