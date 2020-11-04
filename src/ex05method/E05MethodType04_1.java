package ex05method;

import java.util.Scanner;

public class E05MethodType04_1 {

	public static void main(String[] args) {
		int sumOfAge = getToTalAge(5);
		System.out.println("입력받은 나의의 합은? : " + sumOfAge);
	}
	
	static int getToTalAge(int personCnt) {
		Scanner scan = new Scanner(System.in);
		int sumAge = 0;
		
		//입력받은 사람의 수만큼 반복하면서 나이를 입력받음
		for(int i = 1; i <= personCnt; i++) {
			System.out.print(i +"번쨰 사람의 나이 : ");
			int age = scan.nextInt();
			sumAge += age;
		}
		
		
		return sumAge;
	}

}
