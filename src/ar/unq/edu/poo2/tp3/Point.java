package ar.unq.edu.poo2.tp3;

public class Point {

	private int x;
	private int y;
	
	private void Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int i, int j) {
		this.x = i;
		this.y = j;
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public void setX(int n) {
		this.x = n;
	}

	public void setY(int n) {
		this.y = n;
	}
	public int getX() {return this.x;}
	public int getY() {return this.y;}
	
	public void sumaPoint(Point p1) {
		int newX = p1.x + this.x;
		int newY = p1.y + this.y;
		Point(newX,newY);
	}
}
