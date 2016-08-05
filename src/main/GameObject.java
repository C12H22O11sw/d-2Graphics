package main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class GameObject {
int width;
int height;
int x;
int y;
double xD;
double yD;
String name;


int xVelocityComponent;
int yVelocityComponent;

double xVelocityComponentD;
double yVelocityComponentD;

double xForce = 1;
double yForce = 1;

int counter = 0;
Color color;
	
int[][] density;
GameObject(String name,int x, int y,int width, int height,Color color){
	this.name = name;
	this.width = width;
	this.height = height;
	this.x = x;
	this.xD = (double) x;
	this.y = y;
	this.yD = (double) y;
	this.color = color;
	density = new int[width][height];
}



void update(){
	counter++;
	xVelocityComponentD += xForce;
	yVelocityComponentD += yForce;
	yD +=  yVelocityComponentD;
	xD += xVelocityComponentD;
	x =(int) xD;
	y = (int) yD;
	System.out.println(x);
	if(xD > 1080){
		xVelocityComponentD -= (x-1080)/(width*height/1000);
		xForce = 0;
	}
	else if(xD < 0){
		xVelocityComponentD -= (x)/10;
		xForce = 0;
	}

	xVelocityComponentD*=1-(height/10000);
	
	if(yD > 800){
		yVelocityComponentD -= (y-800)/10;
	}

	yVelocityComponentD*=1-(width/10000);
}
void fill(){
	for(int x = 0; x<width; x++){
		for(int y = 0; y<height; y++){
			density[x][y] = 1;
		}
	}
}
int getDensity(int x, int y){
	int returnX = x-this.x;
	int returnY = y-this.y;
	System.out.println(returnX +" "+ returnY);
	if(returnX <0 || returnX > width -1){
		returnX = 0;
	}
	if(returnY <0 || returnY >height -1){
		returnY = 0;
	}

	return density[returnX][returnY];
}
void setImpact(int x, int y){
	if(Math.sqrt( Math.pow(this.x-x, 2)+Math.pow(this.y-y, 2))<Math.sqrt( Math.pow(width, 2)+Math.pow(height, 2))){
		xVelocityComponent = this.x-x;
		yVelocityComponent = this.y-y;
		JOptionPane.showMessageDialog(null, this.name + x+" "+ y);
	}
}
void draw(Graphics graphics){
	graphics.setColor(color);
	graphics.fillRect(x-(width/2), y-(height/2), width, height);
}



}
