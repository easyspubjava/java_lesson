package polymorphism;

class Point{
	int x; 
	int y;
}

class Shape{
	public void draw() {
		System.out.println("draw shape");
	}
}

class Rectangle extends Shape{
	public void draw() {
		System.out.println("draw rectangle");
	}
}


class Circle extends Shape{

	Point p = new Point();
	
	public void draw() {
		System.out.println("draw circle");
	}
}


public class ShapeTest {

	public static void main(String[] args) {

		Shape s = new Shape();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
		drawShape(s);
		drawShape(r);
		drawShape(c);
	}
	
	public static void drawShape(Shape s) {
		s.draw();
	}

}
