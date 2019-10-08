import java.awt.Color;
import java.awt.Graphics;

public class enemy {
	public int speed = 5;
	public int eX = 100;
	public int eY = 25;
	public int Yspeed = eY += speed;
	public int Xspeed = eX += speed;

	void draw(Graphics g){
		g.setColor(Color.MAGENTA);
		g.fillRect(eX, eY, 75, 75);
		
	}
	
	
	
	void movement(){
		
		int X = eX;
		int Y = eY;
		
		X = Xspeed;
		Y = Yspeed;
		
		if (X >= WaveHub.WIDTH) {
			Xspeed = -Xspeed;
		}
		if (X <= 0) {
			Xspeed = -Xspeed;
		}
		if (Y >= WaveHub.HEIGHT) {
			Yspeed = -Yspeed;
		}
		if (Y <= 0) {
			Yspeed = -Yspeed;
		}
		
	}
	
	
	
	
	
	
	
}
