import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        
        int red;
        int green;
        int blue;
        Color color;
        
		 
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		g2.drawRect(10, 10, 765, 540);
		
		
		//2) Draw a horizontal line to bisect the Rectangle
		g2.drawLine(10, 270, 770, 270);
		
		
		//3) Draw a vertical line to bisect the shape again
		g2.drawLine(765/2, 10, 765/2,550 );
		
		int lineNum = 0;
		while (lineNum < 100) {
			red = (int) (Math.random() * 255);
			green = (int) (Math.random() * 255);
			blue = (int) (Math.random() * 255);
			color = new Color(red, green, blue);
			g2.setColor(color);
			int x1 = (int) (Math.random() * 351) + 10;
			int x2 = (int) (Math.random() * 201) + 10;
			int y1 = (int) (Math.random() * 301) + 5;
			int y2 = (int) (Math.random() * 251) + 5;
			g2.drawLine(x1, y1, x2, y2);
			lineNum++;
		}
		
		int circleNum = 0;
		while (circleNum < 100) {
			red = (int) (Math.random() * 255);
			green = (int) (Math.random() * 255);
			blue = (int) (Math.random() * 255);
			color = new Color(red, green, blue);
			g2.setColor(color);
			int di = (int) (Math.random() * 101) + 5;
			int centerX = (int) (Math.random() * 301) + 10;
			int centerY = (int) (Math.random() * (500 - (251 + 1))) + 251;
			g2.drawOval(centerX, centerY, di, di);
			circleNum++;
		}
		
		int squareNum = 0;
		while (squareNum < 100) {
			red = (int) (Math.random() * 255);
			green = (int) (Math.random() * 255);
			blue = (int) (Math.random() * 255);
			color = new Color(red, green, blue);
			g2.setColor(color);
			
			int startX = (int) (Math.random() * (700 - (380-1))) + 380;
			int startY = (int) (Math.random() *201) + 10;
			
			g2.fillRect(startX, startY, 50, 50);
			squareNum++;
		}
		
		
		
		
		/* 
		 * int var = 0; 						<---- control variable
		 * while(var < 10){ 					<---- condition to run the loop
		 *   
		 *   //any repeating code
		 *   
		 *   var++;								<---- update control variable
		 *   
		 * }
		 */
		
		 

	
	
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
