
public class Test {
	public static void main(String[] args) {
		
		Person person = new Person(30, 12345);
		print(person.getID() + "----" + person.getAge());
	}
	
	public static void print(String s) {
		System.out.println(s);
	}
}

