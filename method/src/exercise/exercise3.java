package exercise;
// 定义一个方法判断数组中的某一个数是否存在
// 将结果返回给调用处
public class exercise3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(exist(arr,11));
    }
    public static boolean exist(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
// return和break关键字的区别
// return：跟循环没有什么关系，跟方法有关的，表示1结束方法，2返回结果
//         如果方法执行到了return，整个方法全部结束，里面的循环也随之结束
// break：跟方法没有什么关系，结束循环或者switch的。
