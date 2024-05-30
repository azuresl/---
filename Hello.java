// public class Hello  -Hello是一个公有的类
// Hello{ } -一个类的开始和结束
// public static void main(String[] args） -主方法，即程序入口
// main(){}  -方法的开始和结束
// System.out.println("hello world") -输出hello world到屏幕
// ;  -语句结束
public class Hello {

	//编写一个main方法
	public static void main(String[] args){
		System.out.println("hello world");
	}
}

// 一个源文件中最多只能有一个public类。其他类个数不限
// 编译后，每一个类都对应一个.class
// 公有类类名必须为源文件类名
// main方法写在非public类上，指定运行非public类，入口方法是非public的main方法
