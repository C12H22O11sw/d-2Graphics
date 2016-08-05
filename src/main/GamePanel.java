package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{
Timer timer;

GameObject gameObjectOne = new GameObject("red square",300,300,150,150,Color.RED);
GameObject gameObjectTwo = new GameObject("green square",100,300,200,100,Color.GREEN);
GameObject gameObjectThree = new GameObject("blue square",300,100,100,200,Color.BLUE);

int density[][];
GamePanel(){
	density =  new int [1080][800];
	timer = new Timer(17,this);
	timer.start();
}
void updateDensity(){
	for(int x = 0; x<1079; x+= 10){
		for(int y = 0; y<799; y+= 30){
			density[x][y]=gameObjectOne.getDensity(x,y)+gameObjectTwo.getDensity(x,y)+gameObjectThree.getDensity(x,y);
			System.out.println(x +" "+ y+ " = "+ density[x][y]);
			
			if(density[x][y] > 0||true){
				gameObjectOne.setImpact(x, y);
				gameObjectTwo.setImpact(x, y);
				gameObjectThree.setImpact(x, y);
				JOptionPane.showMessageDialog(null, x+""+y);
				
				
			}
			repaint();
			gameObjectOne.update();
			gameObjectTwo.update();
			gameObjectThree.update();
		}
	}
}
@Override 
public void paintComponent(Graphics graphics){
	gameObjectOne.draw(graphics);
	gameObjectTwo.draw(graphics);
	gameObjectThree.draw(graphics);

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	//System.out.println("timing");
	repaint();
	gameObjectOne.update();
	gameObjectTwo.update();
	gameObjectThree.update();
	updateDensity();
	
}

}
