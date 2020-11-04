package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {

	public static void arithmetic() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("첫번째 숫자를 입력하세요 :");
		int number1 = scan.nextInt();
		System.out.printf("두번째 숫자를 입력하세요 :");
		int number2 = scan.nextInt();
		
		int num = number1 - number2;
		
		System.out.println("덧셈 결과 ->" + number1 + number2);
		System.out.println("뺄셈 결과 ->" + num);
		System.out.println("곱셈 결과 ->" + number1 * number2);
		System.out.println("나눗셈 몫 ->" + number1/number2);
		//%를 사용할려면 %%%(이스케이프 시컨스 기호를 사용함)
		System.out.println("나눗셈 나머지 ->" + number1%number2);
	}
	
	public static void main(String[] args) {
		arithmetic();
	}

}
