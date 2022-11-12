
// 练习键盘输入
// 步骤：1.导包  2.创建Scanner类对象 3.接收数据（调用Scanner类对象的方法）
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入加数整数");
        int add1 = sc.nextInt();

        System.out.println("请输入被加数整数");
        int add2 = sc.nextInt();

        System.out.println("两数相加为:");
        System.out.println(add1 + add2);

    }
}
