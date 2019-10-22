import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class WavePanel extends JPanel implements ActionListener, KeyListener {

	enemy emeny = new enemy();
	
	Player user = new Player();
	
	Timer tim = new Timer(1000/60,this);
        
	protected void paintComponent(Graphics g) {
		emeny.draw(g);
		user.draw(g);
		impact();
	}
	
	WavePanel(){
		tim.start();
	
	}
	
	public void testBounds() {
		int x = WaveHub.WIDTH - user.fatness;
		int y = WaveHub.HEIGHT - user.fatness;
		if (user.pX > x) {
			user.pX =  x;
			//JOptionPane.showMessageDialog(null, "you got mail");
		}
		if (user.pX < 0 ) {
			user.pX = 0;
			//JOptionPane.showMessageDialog(null, "you got mail");
		}
		if (user.pY > y) {
			user.pY = y;
			//JOptionPane.showMessageDialog(null, "you got mail");
			}
		if (user.pY < 0) {
			user.pY = 0;
			
	}}
	
	void impact() {
		
		if (user.pX >= emeny.eX && user.pX <= emeny.xmax && user.pY >= emeny.eY && user.pY <= emeny.ymax) {
			System.out.println("yr mom,  ohohohhhhh   roasted");
			
		}
	System.out.println(user.pX + " " + emeny.eX);
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		emeny.movement();
		impact();
		repaint();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
               user.pX -= user.speeed;   
		}
		else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            user.pX += user.speeed;   
		}
		else if (e.getKeyCode() == KeyEvent.VK_UP) {
            user.pY -= user.speeed;   
		}
		else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            user.pY += user.speeed;   
		}
		else if (e.getKeyCode() == KeyEvent.VK_S) {
            user.pY += user.speeed;   
		}
		else if (e.getKeyCode() == KeyEvent.VK_W) {
            user.pY -= user.speeed;   
		}
		else if (e.getKeyCode() == KeyEvent.VK_D) {
            user.pX += user.speeed;   
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
            user.pX -= user.speeed;   
		}
		testBounds();
		impact();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
