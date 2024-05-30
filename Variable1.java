public class Variable1{
	//主入口
	public static void main (String[] args){

		// 数据类型   变量=数据值；  - = 右边赋值给左边
		// 数据类型：int(整数)  double(小数) -限制了变量能储存数据的类型
		int a = 10;
		System.out.println(a);

		// 变量参与计算，不能重复定义
		int b = 10;
		int c = 20;
		System.out.println(b + c);

		// 修改变量的值
		a = 50;
		System.out.println(a);

		//一条语句定义多个变量
		int d = 100,e = 200,f = 300;
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		 
	}
}