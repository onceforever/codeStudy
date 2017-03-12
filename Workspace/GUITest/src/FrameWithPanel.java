import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class FrameWithPanel {
	public static void main(String args[]) {
		MyFrame myframe = new MyFrame(0, 0, 300, 300);
	}
}

class MyFrame extends Frame {
	MyFrame(int x, int y, int width, int height) {
		Panel panel = new Panel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(width / 4, height / 4, width / 2, height / 2);
		add(panel);
		setLayout(null);
		setBounds(x, y, width, height);
		setBackground(Color.BLUE);
		setVisible(true);
	}
}
