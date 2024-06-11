public class test1 {
    // 数组中有33，5，22，44，55
    // 遍历得到其中最大的值
    // max默认值为arr[0]（初始化值一定要是数组中的值）
    // 此时循环开始条件可以为1（0跟自己比会多一次循环）
    public static void main(String[] args) {
       int[] arr = {33,5,22,44,55};
       int max = arr[0];
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] > max) {
               max = arr[i];
           }
       }
        System.out.println(max);
    }
}
