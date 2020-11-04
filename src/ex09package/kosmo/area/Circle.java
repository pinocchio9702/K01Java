package ex09package.kosmo.area;

//public을 사용하지 않으면 클래스를 찾을 수 없음
public class Circle {
	double rad;
	final double PI;
	
	public Circle(double rad) {
		this.rad = rad;
		PI = 3.14159;
	}
	
	public double getArea() {
		return PI * rad * rad;
	}
}
