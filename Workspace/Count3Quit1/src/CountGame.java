import java.util.List;

class CountGame {
	private List<Student> studentGroup;

	public CountGame(List<Student> studentGroup) {
		this.studentGroup = studentGroup;
	}

	public void countAndQuit(int countNum) {
		System.out.println("\n\n\n\ncount " + countNum + " quit 1");
		
		int leftStudentNum = this.studentGroup.size();
		int counter = 0;
		
		for(int i = 0; i < this.studentGroup.size();) {
			if(1 == leftStudentNum) {
				return;
			}
			
			if(this.studentGroup.get(i).isStillInCount()) {
				counter++;
			}
			
			if(counter == countNum) {
				this.studentGroup.get(i).kickOut();
				leftStudentNum--;
				counter = 0;
			}
			
			i++;
			
			if(i == this.studentGroup.size()) {
				i = 0;
			}
		}
	}

	public Student getLeftStudent() {
		for (Student tempStudent : this.studentGroup) {
			if (tempStudent.isStillInCount() == true) {
				return tempStudent;
			}
		}
		
		return new Student("404 Not Found", 0);
	}
	
	public void resetGame() {
		for(int i = 0; i < this.studentGroup.size(); i++) {
			this.studentGroup.get(i).setInCount();
		}
	}
}