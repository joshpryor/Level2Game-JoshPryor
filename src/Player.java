import java.awt.Color;
import java.awt.Graphics;

public class Player {


	public int pX = 500;
	public int pY = 200;
	public int speeed = 20;
	
	void draw(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(pX, pY, 75, 75);
		
	}
	
	
	
}
