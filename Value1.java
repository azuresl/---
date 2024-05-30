public class Value1{
	public static void main(String[] args){
		// 整数
		System.out.println(666); 

		// 小数
		System.out.println(1.1);

		// 字符串
		System.out.println("java");

		// 字符
		System.out.println("b");

		// bool
		System.out.println(true);

		// null 要用字符串形式打印，不能直接打
		System.out.println("null");

		// \t 制表符 print时把前面字符串长度补齐到8n空格。只补1-8个空格
		System.out.println("name" + '\t' + "age");
		System.out.println("tom" + '\t' + "23");
	}
}