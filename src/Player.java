import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Player {

	public int fatness = 75;
	public int pX = 500;
	public int pY = 200;
	public int speeed = 50;
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	
	Player(){
		if (needImage) {
		    loadImage ("candy.png");
		}
		
	}
	
	void draw(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(pX, pY, fatness, fatness);
		if (gotImage) {
			g.drawImage(image, pX, pY, fatness, fatness, null);
		} else {
			g.setColor(Color.BLUE);
			g.fillRect(pX, pY, fatness, fatness);
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
	
	
	
	
	
	
	
	
}
