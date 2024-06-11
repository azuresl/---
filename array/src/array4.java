public class array4 {
    public static void main(String[] args) {
        //定义一个数组，用来存班级中50个同学的姓名
        // 姓名未知，等学生报道之后，再进行添加
        // 自己指定长度，系统给出默认的初始化值
        // 数据类型[] 数组名 = new 数据类型[数组长度]
        String[] name = new String[50];
        name[0] = "zhangsan";
        System.out.println(name[0]);
        System.out.println(name[1]);

        // 整数类型:默认初始化值为0
        // 小数类型：默认初始化值为0.0
        // 字符类型：默认初始化为'\u0000'
        // 布尔类型：默认初始化值为false
        // 引用数据类型：默认初始化值为null

        int[] arr = new int[3];
        System.out.println(arr[0]);

    }
}
