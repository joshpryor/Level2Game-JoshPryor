import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class enemy {
	public int speed = 10;
	public int eX = 100;
	public int eY = 25;
	public int Yspeed =  speed;
	public int Xspeed =  speed;
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	

	enemy(){
		if (needImage) {
		    loadImage ("apple2.jpg");
		}
		
	}
	
	void draw(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(eX , eY, 75, 75);
		if (gotImage) {
			g.drawImage(image, eX, eY, 75, 75, null);
		} else {
			g.setColor(Color.RED);
			g.fillRect(eX, eY, 75, 75);
		}
	}
	
	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}
	
	void movement(){
		
		eX += Xspeed;
		eY += Yspeed;
		

		
		if (eX >= WaveHub.WIDTH) {
			Xspeed = -Xspeed;
		}
		if (eX <= 0) {
			Xspeed = -Xspeed;
		}
		if (eY >= WaveHub.HEIGHT) {
			Yspeed = -Yspeed;
		}
		if (eY <= 0) {
			Yspeed = -Yspeed;
		}
		
	}
	
	
	
	
	
	
	
}
