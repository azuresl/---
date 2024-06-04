package for_circulation;
// 网不好要执行断线重连
// 公司要求最多写五次断线重连
public class test1_2 {
    public static void main(String[] args) {
        for(int i = 1;i <= 5;i++){
            System.out.println("执行第" + i +"次断线重连的业务逻辑");
        }
    }

}
