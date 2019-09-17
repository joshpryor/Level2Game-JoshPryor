import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class WavePanel extends JPanel implements ActionListener {

	enemy emeny = new enemy();
	
	Timer tim = new Timer(1000/60,this);
        
	protected void paintComponent(Graphics g) {
		emeny.draw(g);
		
	}
	
	WavePanel(){
		tim.start();
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
