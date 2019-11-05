import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class WavePanel extends JPanel implements ActionListener, KeyListener {

	enemy emeny = new enemy();
	
	Player user = new Player();
	
	Timer tim = new Timer(1000/60,this);
	Timer timmy = new Timer(7000,this);
	ArrayList<enemy> emenys = new ArrayList<enemy>(); 
	
	
	
	public boolean bannana = false; 
        
	protected void paintComponent(Graphics g) {
		for (int i = 0; i < emenys.size(); i++) {
			emenys.get(i).draw(g);
		}
		
		user.draw(g);
		impact();
	}
	
	//              Add another member variable aliens that will hold an ArrayList of Alien objects. Initialize this 
	//              variable to an empty ArrayList. Add a member variable random and initialize it to a new Random object. 
	//              Also create an addAlien() method that contains the code below.


	//emenys.add(new enemy());
	WavePanel(){
		
		tim.start();
	    timmy.start();
	    emenys.add(emeny);
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

		if (user.pX >= emeny.eX && user.pX <= emeny.eX+75 && user.pY >= emeny.eY && user.pY <= emeny.eY+75) {
			bannana = true;
			
		}

	}
	void testImpact() {
		if(bannana == true) {
			System.out.println("you got mail,    from saten");
			
			
			bannana = false;
		}
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == tim) {
			//emeny.movement();
			for (int i = 0; i < emenys.size(); i++) {
				emenys.get(i).movement();
			}
			impact();
			testImpact();
			repaint();
		}
		else if(e.getSource() == timmy) {
			emenys.add(new enemy());
		}
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
