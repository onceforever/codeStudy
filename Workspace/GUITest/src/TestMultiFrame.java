import java.awt.Color;
import java.awt.Frame;

public class TestMultiFrame {
	public static void main(String args[]) {
		MyFrame myFrame1 = new MyFrame(100, 100, 200, 200, Color.BLUE);
		MyFrame myFrame2 = new MyFrame(300, 100, 200, 200, Color.GRAY);
		MyFrame myFrame3 = new MyFrame(100, 300, 200, 200, Color.GREEN);
		MyFrame myFrame4 = new MyFrame(300, 300, 200, 200, Color.BLACK);
	}
}

class MyFrame extends Frame {
	static int id = 0;
	MyFrame(int x, int y, int w, int h, Color color) {
		super("Frame : " + (++id));
		this.setBounds(x, y, w, h);
		this.setBackground(color);
		this.setVisible(true);
	}
}
