package codecheck;

import java.awt.Color;
import java.awt.Frame;

public class TestFrame {
	public static void main(String[] args) {
		MyFrame myFrame1 = new MyFrame(10, 10, 20, 20, Color.MAGENTA);
		MyFrame myFrame2 = new MyFrame(20, 10, 20, 20, Color.ORANGE);
		MyFrame myFrame3 = new MyFrame(10, 20, 20, 20, Color.GREEN);
		MyFrame myFrame4 = new MyFrame(20, 20, 20, 20, Color.GRAY);
	}
	
}
class MyFrame extends Frame {
		static int ID = 0;
		
		MyFrame(int x, int y, int width, int height, Color color) {
			this.setBounds(x, y, width, height);
			this.setBackground(color);
			this.setTitle("MYFRAME" + " " + ++ID);
			this.setLayout(null);
			this.setVisible(true);
		} 
	}