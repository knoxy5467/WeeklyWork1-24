package dev.knoxy;

public class Rectangle {
	
	private double length;
	private double width;
	private double area;
	private double perimeter;
	
	public Rectangle(double w, double l) {
		width = w;
		length = l;
		area = width * length;
		perimeter = (width * 2) + (2* length);
	}
	
	public Rectangle() {
		width = 1;
		length = 1;
		area = width * length;
		perimeter = (width * 2) + (2* length);
		
	}
	
	public double getArea() {
		return area;
	}
	
	public double getPerimeter() {
		return perimeter;
	}
	
	public void setLength(double l) {
		length = l;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}

}
