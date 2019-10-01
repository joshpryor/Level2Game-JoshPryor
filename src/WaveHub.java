import javax.swing.JFrame;

public class WaveHub {

	JFrame window = new JFrame();
	
	WavePanel panal = new WavePanel();
	
	public static final int WIDTH = 1500;
	public static final int HEIGHT = 800;
	
	public static void main(String[] args) {
		WaveHub wavehub = new WaveHub();
		
		wavehub.method();
	}
	
	void method() {
	window.setVisible(true);
	window.setSize(WIDTH, HEIGHT);
	window.add(panal);
	window.addKeyListener(panal);
		
		
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
	}
	
	
}
