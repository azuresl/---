package exercise;
// 设计一个方法求数组的最大值，并将最大值返回
public class exercise2 {
    public static void main(String[] args) {
        int[] arr = {1,5,7,3,8,10};
        System.out.println(max(arr));
    }
    public static int max(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
