package tankClient;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TankClient extends Frame{
	
	private int x = 100;
	private int y = 100;
	
	public void paint(Graphics g) {
		Color color = g.getColor();
		g.setColor(Color.RED);
		g.fillOval(x, y, 35, 35);
		g.setColor(color);
		
	}

	public static void main(String[] args) {
		TankClient tankClient = new TankClient();
		tankClient.launchFrame();
	}
	
	public void launchFrame() {
		this.setLocation(100, 100);
		this.setSize(800, 500);
		this.setTitle("TankWar");
		this.setResizable(false);
		this.setVisible(true);
		this.setBackground(Color.GREEN);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				System.exit(0);
			}
			
		});
		new Thread(new PaintThread()).start();
	}
	
	private class PaintThread implements Runnable{
		public void run() {
			while (true) {
				y += 10;
				if(y > 250) {
					x += 10;
				}
				repaint();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	

}
