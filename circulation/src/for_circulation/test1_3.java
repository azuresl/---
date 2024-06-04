package for_circulation;
// 获取一个范围中的某个数据也会用到循环
// 如求和：求1-5之间的和
// 1.注意变量的作用范围
//   求和的变量不能定义在里面，出了大括号就用不了
// 2.变量定义在循环里面，那么当前变量只在本次循环中有效
//   循环结束后会消失
//   第二次循环重新定义新变量

public class test1_3 {
    public static void main(String[] args) {
        int j = 0 ;
        for(int i = 1; i <= 5; i++){
            j += i;
        }
        System.out.println(j);
    }
}
