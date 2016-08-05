package main;

import javax.swing.JFrame;

public class Window {
	int width;
	int height;
	JFrame frame;
	GamePanel gamepanel;
	public static void main(String[] args) {
		Window window = new Window(1080,800);
	}
	Window(int width, int height){
		this.width = width;
		this.height = height;
		frame = new JFrame();
		gamepanel = new GamePanel();
		frame.add(gamepanel);
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	void update(){
		gamepanel.updateDensity();
	}
	int getNumberOfHits(int x,int y){
	//	gamepanel.numberOfHits(x,y);
		return 1;
	}
}
