package ex05method;

import java.util.Scanner;

public class QuTemperature {

	
	public static void celsiusToFahrenheit() {
		Scanner scan = new Scanner(System.in);
		
		double cel;
		double faher;
		
		System.out.printf("섭씨를 입력하세요 : ");
		
		cel = scan.nextInt();
		
		faher = 1.8 * cel + 32;
		
		System.out.println("화씨로 변화된 온도는 " + faher +"입니다." );
	}
	
	public static void fahrenheitToCelsius() {
		Scanner scan = new Scanner(System.in);
		
		double cel;
		double faher;
		
		System.out.printf("화씨를 입력하세요 : ");
		faher = scan.nextInt();
		
		cel = (faher - 32) / 1.8;
		
		System.out.println("섭씨로 변화된 온도는 " + cel + "입니다.");
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int check;
		
		System.out.println("섭씨로 변화하고 싶으면 1");
		System.out.println("화씨로 변화하고 싶으면 2 를 누르세요");
	
		check = scan.nextInt();
		
		if(check == 1) {
			fahrenheitToCelsius();
		}
		else if(check == 2) {
			celsiusToFahrenheit();
		}
	
	}

}
