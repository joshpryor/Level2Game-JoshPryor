import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class Player {

	public int fatness = 75;
	public int pX = 500;
	public int pY = 200;
	public int speeed = 50;
	
	void draw(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(pX, pY, fatness, fatness);
		
	}
	
	
	
	
	
	
	
	
	
	
}
