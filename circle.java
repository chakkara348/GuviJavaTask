package javaTask;

public class circle {
	
	int radius;
	double pi,C;
	
	public circle() {
		System.out.println("This is the Java program to find the circumference of a circle");
	}
	public circle(int radius, double pi) {
		this.radius = radius;
		this.pi = pi;
	}
	public void circumference() {
		C = 2 * pi * radius;
		System.out.println("The Circumference of radius: "+C);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		circle Obj1 = new circle();
		circle Obj2 = new circle(6,3.14);
		Obj2.circumference();
	}

}
