package quiz;

import java.util.Scanner;

public class QuFibonacciSeries {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("출력할 피보나치 수열의 항목갯수를 입력하세요 :");
		int fiboCount = scan.nextInt();
		
		//피보나치수열 출려을 위한 메소드 호출
		fibonacciFunc(fiboCount);
	}
	
	public static void fibonacciFunc(int fCount) {
		
		int f1 = 0, f2 = 1, f3;
		
		if(fCount <= 1){
			System.out.println("피보나치 수열은 0,1부터 시작이므로 항상 2이상 입력해야합니다.");
		}
		
		else {
			//2이상의 숫자라면 먼저 0,1을 출력한다.
			System.out.printf("%d  %d ", f1, f2);
		}
		
		/*
		 피노나치수열은 무조건 0,1부터 시작으므로 전체횟수에서 -2만큼의 요소가 출력되어야 한다.
		 */
		for(int i = 1; i <= fCount-2; i++) {
			//첫번쨰 수와 두번쨰 수를 더한 후 곧바로 출력한다.
			f3 = f1 + f2;
			System.out.printf("  %d", f3);
			//f1, f2에 새로운값(다음항목)으로 변경한다.
			f1 = f2;
			f2 = f3;
		}
		
		
		
	}

}
