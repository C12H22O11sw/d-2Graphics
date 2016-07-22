package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{
Timer timer;
GameObject gameObject = new GameObject(300,300,100,100,Color.RED);





GamePanel(){
	
	timer = new Timer(17,this);
	timer.start();
}







@Override 
public void paintComponent(Graphics graphics){
	gameObject.draw(graphics);
}







@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	//System.out.println("timing");
	repaint();
	gameObject.update();
	
}

}
