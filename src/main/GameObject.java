package main;

import java.awt.Color;
import java.awt.Graphics;

public class GameObject {
int width;
int height;
int x;
int y;
double xD;
double yD;


int xVectorComponent;
int yVectorComponent;

double xVectorComponentD;
double yVectorComponentD;

double xForce = 1;
double yForce;

int counter = 0;
Color color;
	
	
GameObject(int x, int y,int width, int height,Color color){
	this.width = width;
	this.height = height;
	this.x = x;
	this.y = y;
	this.color = color;
}



void update(){
	counter++;
	xVectorComponentD += xForce;
	yVectorComponentD += yForce;
	yD +=  yVectorComponentD;
	xD += xVectorComponentD;
	x =(int) xD;
	y = (int) yD;
	System.out.println(x);
	if(xD > 100){
		xForce = -xForce;
	}
}



void draw(Graphics graphics){
	graphics.setColor(color);
	graphics.fillRect(x, y, width, height);
}



}
