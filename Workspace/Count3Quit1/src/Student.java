
public class Student {

	private String name;
	private int id;
	private boolean isInCount;

	Student(String name, int id) {
		this.name = name;
		this.id = id;
		this.isInCount = true;
	}

	public String getname() {
		return this.name;
	}
	
	public int getID() {
		return this.id;
	}

	public void kickOut() {
		this.isInCount = false;
	}

	public boolean isStillInCount() {
		return this.isInCount;
	}
	
	public void setInCount() {
		this.isInCount = true;
	}
}
