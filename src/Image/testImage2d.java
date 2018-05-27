package Image;
import java.awt.Color;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

public class testImage2d {
	public static void main(String[] args) throws InterruptedException {
		Image2d img = new Image2d(256);
		img.addPolygon(new int[] {50,100,150,200}, new int[] {50,150,200,100}, Color.BLUE, Color.RED);
		img.addSegment(50, 200, 150, 100, 4, Color.GREEN);
		JFrame s= new Image2dViewer(img);	
		//TimeUnit.SECONDS.sleep(1);
		img.addCircle(0, 0, 10, Color.cyan);
		TimeUnit.SECONDS.sleep(1);
		img.addCircle(0,200, 10, Color.cyan);
		
		s.repaint();
		TimeUnit.SECONDS.sleep(1);
		img.clear();
		img.addCircle(100, 2, 123, Color.RED);
		//new Image2dViewer(img);
	}
}
