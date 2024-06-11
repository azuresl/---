public class array3 {
    public static void main(String[] args) {

        // 数组遍历：将数组中所有内容取出来，取出来之后可以打印、求和等等
        int[] arr = {1,2,3,4,5};
        // 利用循环获取数组里面所有的元素
        // 开始条件：0
        // 结束条件：4（最大索引）
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            //调用数组的长度函数：数组名.length
        }
        // idea提供快速生成数组的遍历方式
        // 数组名.fori

    }
}
