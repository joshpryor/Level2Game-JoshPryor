
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WaveHub {

	JFrame window = new JFrame();
	static boolean bruh = false;
	WavePanel panal;
	
	public static final int WIDTH = 1500;
	public static final int HEIGHT = 823;
	
	public static void main(String[] args) {
		WaveHub wavehub = new WaveHub();
		String intro = JOptionPane.showInputDialog("you can use the arrow keys to move or use ASWD,\n avoid enemys and dont hide in the corrners like a noob.\n type and enter anything to start");
		if (intro.equals("no")) {
			JOptionPane.showMessageDialog(null, "U suck");
		}
		else {
			wavehub.method();
			
		}
		
	}
	
	public void method() {
		bruh = true;
		panal = new WavePanel();
	window.setVisible(true);
	window.setSize(WIDTH, HEIGHT);
	window.add(panal);
	window.addKeyListener(panal);

		
		
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		
	}
	
	
}
