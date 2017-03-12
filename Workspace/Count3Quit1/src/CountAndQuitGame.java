import java.util.ArrayList;
import java.util.List;

public class CountAndQuitGame {
	public static void main(String[] args) {
		String[] students = new String[]{"heyaunquan", "zhenghaoyue", "yujinshan", "kanglihong", "liuyunchao", "sushaohua", "lishiqi", "maoyushi", "hebaomin", "wanghuan", "wangmin"};
		System.out.println("/**************************************/\nall students are:");
		for(int i = 0; i < students.length; i++) {
			System.out.print(students[i] + "   ");
		}
		
		List<Student> studentGroup = new ArrayList<Student>();
		
		for(int i = 0; i < students.length; i++) {
			studentGroup.add(new Student(students[i], i + 1));
		}
		
		CountGame countGame = new CountGame(studentGroup);
		countGame.resetGame();
		countGame.countAndQuit(3);
		Student leftStudent = countGame.getLeftStudent();
		leftStudent = countGame.getLeftStudent();
		System.out.println("/*************************************/\nthe name of the last student is :\n" + leftStudent.getname() + ", and ID is " + leftStudent.getID());
	}
}









