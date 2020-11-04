package ex02variable;

public class Qu_02_03 {

	public static void main(String[] args) {
		
		final double PI = 3.14;
		final int RADIUS = 10;
		
		int area_int = (int) (RADIUS *RADIUS * PI);
		float area_float = (float) (RADIUS *RADIUS * PI);
		double area_double = RADIUS *RADIUS * PI;
		
		
		
		System.out.println("int형 넓이 : " + area_int);
		System.out.println("float형 넓이 : " + area_float);
		System.out.println("double넓이 : " + area_double);
		
	}

}
