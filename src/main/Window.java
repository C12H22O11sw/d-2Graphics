package main;

import javax.swing.JFrame;

public class Window {
	int width;
	int height;
	static int[][] space = new int[1080][800];
	JFrame frame;
	GamePanel gamepanel;
	public static void main(String[] args) {
		Window window = new Window(1080,800);
		for(int x = 0; x <1800; x++){
			for(int y = 0; y < 800; y++){
				space[x][y] = window.getNumberOfHits(x,y);
			}
		}
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
	int getNumberOfHits(int x,int y){
	//	gamepanel.numberOfHits(x,y);
		return 1;
	}
}
