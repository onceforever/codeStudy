import java.awt.Color;
import java.awt.Frame;

public class TestFrame {
	public static void main(String args[]) {
		Frame myFrame = new Frame("my first frame");
		myFrame.setLocation(100, 100);
		myFrame.setSize(300, 300);
		myFrame.setBackground(Color.BLUE);
		myFrame.setVisible(true);
	}
}
