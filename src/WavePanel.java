import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class WavePanel extends JPanel implements ActionListener, KeyListener {

	enemy emeny = new enemy();
	
	Player user = new Player();
	
	Timer tim = new Timer(1000/60,this);
        
	protected void paintComponent(Graphics g) {
		emeny.draw(g);
		user.draw(g);
	}
	
	WavePanel(){
		tim.start();
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
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
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            user.pX += user.speeed;   
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
            user.pY -= user.speeed;   
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            user.pY += user.speeed;   
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
