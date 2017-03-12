package tankClient;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TankClient extends Frame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TankClient tankClient = new TankClient();
		tankClient.launchFrame();
	}
	
	public void launchFrame() {
		this.setLocation(100, 100);
		this.setSize(800, 500);
		this.setTitle("TankWar");
		this.setResizable(false);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				System.exit(0);
			}
			
		});
	}

}
