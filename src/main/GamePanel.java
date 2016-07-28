package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{
Timer timer;

int searchX = 0;
int searchY = 0;
GameObject gameObjectOne = new GameObject("red square",300,300,150,150,Color.RED);
GameObject gameObjectTwo = new GameObject("green square",100,300,200,100,Color.GREEN);
GameObject gameObjectThree = new GameObject("blue square",300,100,100,200,Color.BLUE);





GamePanel(){
	
	timer = new Timer(17,this);
	timer.start();
}
int numberOfHits(){
	return gameObjectOne.isThisObject(searchX,searchY) + 
		   gameObjectTwo.isThisObject(searchX,searchY) + 
		   gameObjectThree.isThisObject(searchX,searchY);
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
	
}

}
