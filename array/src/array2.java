import com.sun.jdi.PathSearchingVirtualMachine;

public class array2 {
    public static void main(String[] args) {
        // 索引：也叫做下标，角标
        // 索引的特点：从0开始，逐个+1增长，连续不间断

        // 获取数组中的元素
        // 格式：数组名[索引]
        int[] age = {11,12,13,14,15,16,17,18,19,20};
        int num = age[0];
        System.out.println(num);
        System.out.println(age[4]);

        // 把数据存储到数组当中
        // 格式：数组名[索引] = 具体数据/变量
        //一旦覆盖，原来的数据就不存在了
        age[0] = 100;
        System.out.println(age[0]);

    }
}
