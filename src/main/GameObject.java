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
String name;


int xVectorComponent;
int yVectorComponent;

double xVectorComponentD;
double yVectorComponentD;

double xForce = 1;
double yForce = 1;

int counter = 0;
Color color;
	
	
GameObject(String name,int x, int y,int width, int height,Color color){
	this.name = name;
	this.width = width;
	this.height = height;
	this.x = x;
	this.xD = (double) x;
	this.y = y;
	this.yD = (double) y;
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
	if(xD > 1080){
		xVectorComponentD -= (x-1080)/10;
		xForce = 0;
	}
	else if(xD < 0){
		xVectorComponentD -= (x)/10;
		xForce = 0;
	}

	xVectorComponentD*=1-(height/100000);
	
	if(yD > 800){
		yVectorComponentD -= (y-800)/10;
		

	}

	yVectorComponentD*=1-(width/100000);
}



void draw(Graphics graphics){
	graphics.setColor(color);
	graphics.fillRect(x-(width/2), y-(height/2), width, height);
}
void setImpact(int x,int y){
	xD =  this.x-x;
	yD =  this.y-y;
}
int isThisObject(int x, int y){
	if(Math.abs(this.x - x) < width/2){
		if(Math.abs(this.x-x) < height/2){
			return 1;
		}
		else{
			return 0;
		}
	}
	else{ 
		return 0;
	}
}


}
