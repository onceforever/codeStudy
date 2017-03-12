
public class HelloWorld {
	
	static String hello = "Hello World!";
	
	public static void main(String[] args) {
		/*
		 * 任何变量都必须先声明，再赋值才能使用
		 * 方法里声明的变量，包括函数的参数都是局部变量
		 * 在类里面函数外面声明的变量是成员变量
		 */
		System.out.println("Hello World!");
		System.out.println(hello);
		
		boolean flag = true;
		if (flag) {
			System.out.println(flag);
		}
	}
}
