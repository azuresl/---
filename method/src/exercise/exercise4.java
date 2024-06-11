package exercise;
// 定义一个方法copyOfRange(int[] arr,int from,int to)
// 功能：将数组arr中从索引from(包含)开始
//      到索引to结束(不包含)的元素复制到新数组中
//      将新数组返回
public class exercise4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] copy = copyOfRange(arr, 3, 7);
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
    public static int[] copyOfRange(int[] arr,int from,int to){
        // 从索引from(包含)开始到索引to结束(不包含)的元素复制到新数组中
        int[] arrcopy = new int[to-from];
        // 伪造索引的思想
        int index = 0;
        for(int i=from;i<to;i++){
            arrcopy[index] = arr[i];
            index++;
        }
        return arrcopy;
    }
}
