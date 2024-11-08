package Programs;

public class Circle {
private int radius;

public Circle() {
	System.out.println("Circumference of a circle");
}
public Circle(int radius) {
	this.radius = radius;
}
public double getradius() {
	double circumference = 2*Math.PI*radius;
	return circumference;
}
public static void main(String[] args) {
	new Circle();
	Circle c = new Circle(15);
	System.out.printf("%.2f",c.getradius());
	
}
}
