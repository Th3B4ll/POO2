package ar.unq.edu.poo2.tp3;

public class Rectangulo {
	
	private int a;
	private int b;
	private Point p0; 
	
	public double area() {return this.a * this.b;}

	public double perimetro() {return this.a * 2 + this.b * 2;}
	
	public int getA() {return a;}

	public void setA(int a) {this.a = a;}

	public int getB() {return b;}

	public void setB(int b) {this.b = b;}

	public Point getP0() {return p0;}

	public void setP0(Point p0) {this.p0 = p0;}

	public Rectangulo(int x, int y, int a, int b) {
		Point p = new Point(x,y);
		this.a = a;
		this.b = b;
	}
	
	public boolean esHorizontal() {
		return this.a < this.b;
	}
	
	public Rectangulo() {
		
	}
}