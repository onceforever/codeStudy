
public class Person {
	
	private int age = 20;
	private int ID;
	
	/*
	 * ���캯�������ֺ�������ȫ��ͬ��û�з���ֵ��Ҳû��void
	 * ���û���ƶ����췽�������������Զ����һ�����췽����һ����Ϊ����һ�����췽�����������Ͳ��������ɹ��캯��
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
