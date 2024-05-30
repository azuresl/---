import java.util.Scanner;
public class ScannerTest{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("请输入两个整数"); 

	int num1 = sc.nextInt();
	int num2 = sc.nextInt();

	System.out.println("他们的和为");
	
	System.out.println(num1 + num2);

	}
}