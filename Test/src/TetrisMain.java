import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class TetrisMain extends Canvas implements Runnable, KeyListener{

	public static final int WIDTH = 400, Height = 500;
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Tetris");frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		TetrisMain tm = new TetrisMain();
		frame.add(tm);
		frame.setVisible(true);
		tm.start();
		
		
		

	}

	public void start() {
		Thread t=new Thread(this);
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		boolean running = true;
		while(running){
			update();
			BufferStrategy buf = getBufferStrategy();
			if(buf == null){
				createBufferStrategy(3);
				continue;
			}
			Graphics2D g = (Graphics2D)buf.getDrawGraphics();
			render(g);
			buf.show();
		}
		
	}

	private void render(Graphics2D g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		
	}

	private void update() {
		// TODO Auto-generated method stub
		
	}

}
