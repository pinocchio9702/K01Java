package ex05method;

import java.util.Scanner;

public class QuCircleCalculator {

	//원의 넓이(반환값이 없는 형태)
	public static void circleArea(double half) {
		double area= 3.14 * half * half;
		
		System.out.println("원의 넓이(" + half + ") : " + area);
	}
	
	//원의 둘레(반환값이 있는 형태)
	public static double circleRound(double half) {
		
		double round = 2 * 3.14 * half;
		
		
		return round;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("원의 반지름 : ");
		
		double half = scan.nextInt();
		
		System.out.printf("원의 둘레(%.1f) : %.1f\n" ,half, circleRound(half));

		circleArea(half);

		
	}

}
