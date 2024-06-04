package while_circulation;
// for循环和while循环的区别
// 珠穆朗玛峰8844.43米(8844430mm),一张纸厚度为0.1毫米
// 问折叠多少次，可以折成珠穆朗玛峰的高度
public class test1 {
    public static void main(String[] args) {
        int count = 0;
        double i = 0.1;
        while (i <= 8844430){
            i = i * 2;
            count ++;
        }
        System.out.println(count);
    }
}
