package switch_judgement;
// 拉面，热干面，炸酱面，油泼面
// 定义变量记录想吃的面
// 拿着想吃的面用switch跟四种面匹配
public class sw1 {
    public static void main(String[] args) {
        String noodles = "拉面";
        switch (noodles){
            case"拉面":
                System.out.println("拉面");
                break;
            case"热干面":
                System.out.println("热干面");
                break;
            case"炸酱面":
                System.out.println("炸酱面");
                break;
            case"油泼面":
                System.out.println("油泼面");
                break;
            default:
                System.out.println("方便面");
        }
    }
}
