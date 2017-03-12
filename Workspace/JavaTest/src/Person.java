
public class Person {
	
	private int age = 20;
	private int ID;
	
	/*
	 * 构造函数：名字和类名完全相同，没有返回值，也没有void
	 * 如果没有制定构造方法，编译器会自动添加一个构造方法，一旦认为定义一个构造方法，编译器就不会再生成构造函数
	 */
	public Person(int age, int iD) {
		this.age = age;
		ID = iD;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getID() {
		return ID;
	}

	public int getAge() {
		return age;
	}
}
