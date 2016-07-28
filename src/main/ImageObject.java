package main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ImageObject {
	int x;
	int y;
	int width;
	int height;
	BufferedImage image;
	ImageObject(int x,int y,int width,int height,BufferedImage image){
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
	this.image = image;
	}
	void draw(Graphics g){
		g.drawImage(image,x,y,width,height,null);
	}
	
}
