import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class enemy {
	public int fatness = 75;
	public int speed = 10;
	public int eX = 100;
	public int eY = 25;
	public int Yspeed =  speed;
	public int Xspeed =  speed;
	public int xmax = eX += fatness;
	public int ymax = eY += fatness;

	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	

	enemy(){
		if (needImage) {
		    loadImage ("apple2.jpg");
		}
		
	}
	public static String bob = Player.agatha;
	void draw(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(eX , eY, fatness, fatness);
		if (gotImage) {
			g.drawImage(image, eX, eY, fatness, fatness, null);
		} else {
			g.setColor(Color.RED);
			g.fillRect(eX, eY, fatness, fatness);
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
	
	public static String bobby = " Y = Y";
	
	
	
	
	
}
