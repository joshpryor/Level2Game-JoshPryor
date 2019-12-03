import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class WavePanel extends JPanel implements ActionListener, KeyListener {

	enemy emeny ;
	
	Player user = new Player();
	int score = 0;
	Timer tim = new Timer(1000/60,this);
	
	Font titleFont = new Font("Arial", Font.PLAIN, 48);
	 
	Timer timmy = new Timer(7000,this);
	ArrayList<enemy> emenys = new ArrayList<enemy>(); 
	
	

        
	protected void paintComponent(Graphics g) {
		for (int i = 0; i < emenys.size(); i++) {
			emenys.get(i).draw(g);
		}
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString( "score " + score , 100, 100);
		
		user.draw(g);
		
	}
	
	void start() {
		 emenys = new ArrayList<enemy>();
		 user = new Player();
		 emeny = new enemy();
		 tim.start();
		    timmy.start();
		    
			if (WaveHub.bruh ) {
		    emenys.add(emeny);
			}
	}
	
	
	//              Add another member variable aliens that will hold an ArrayList of Alien objects. Initialize this 
	//              variable to an empty ArrayList. Add a member variable random and initialize it to a new Random object. 
	//              Also create an addAlien() method that contains the code below.


	//emenys.add(new enemy());
	WavePanel(){
		
		start();
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
	
	public void noCorners(){
		//bottom right
		if (user.pX+75 >= WaveHub.WIDTH-45 && user.pY+75 >= WaveHub.HEIGHT-75) {
			score -= 7;
		}
		//top left         working
		else if (user.pX == 0 && user.pY == 0) {
			score -= 7;
		}
		//bottom left
		else if (user.pX == 0 && user.pY+75 >= WaveHub.HEIGHT-75) {
			score -= 7;
		}
		//top right
		else if (user.pX+75 >= WaveHub.WIDTH-65 && user.pY == 0) {
			score -= 7;
		}
		
		
	}
	
	void restart() {
		
		score = 0;
		start();
		
	}
	
	
//	void impact(enemy emeny) {
//
//		
//		
//			
//		
//		
//		if (user.pX >= emeny.eX && user.pX <= emeny.eX+75 && user.pY >= emeny.eY && user.pY <= emeny.eY+75) {
//			JOptionPane.showMessageDialog(null, "you got mail");
//			
//		}
//
//	
//	
//	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		Rectangle player = new Rectangle(user.pX,user.pY,75,75);
		// TODO Auto-generated method stub

		if (e.getSource() == tim) {
			//emeny.movement();
			noCorners();
			score += 1;
			for (enemy emeny : emenys) {
				emeny.movement();
				Rectangle emenr = new Rectangle(emeny.eX,emeny.eY,75,75);
				
				if(WaveHub.shouldNotDie == false) {
					
				if (player.intersects(emenr)) {
					tim.stop();
					timmy.stop();
					String restart = JOptionPane.showInputDialog(null, " type and enter aything to restart.\n your score was " + score );
					if (restart.equals(null)) {
						System.exit(0);
					}
					if (restart.equals("no")) {
						JOptionPane.showMessageDialog(null, "U suck");
					}
					else {
						restart();
					}
				}
				
				}
			}
			
		
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
		if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
               user.pX -= user.speeed;   
		}
		else if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
            user.pX += user.speeed;   
		}
		else if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W) {
            user.pY -= user.speeed;   
		}
		else if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S) {
            user.pY += user.speeed;   
		}
		
		testBounds();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
