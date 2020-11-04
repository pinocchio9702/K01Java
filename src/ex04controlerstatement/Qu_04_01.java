package ex04controlerstatement;

import java.io.IOException;

public class Qu_04_01 {

	public static void main(String[] args) throws IOException {
		
		/*
		 다른 방법]
		 숫자형 문자가 가지고 있는 아스키 코드 값에서 48(0의 아스키코드)
		 을 빼면 해당문자의 정수가 된다.
		 */
		
		int user;
		
		System.out.printf("문자 하나를 입력하세요 : ");
		
		user = System.in.read();
		
		if(user >= 48 && user <=57 ) {
			if(user % 2 == 0) {
				System.out.println("2의 배수입니다.");
			}
			else {
				System.out.println("2의 배수가 아닙니다.");
			}
		}
		else {
			System.out.println("숫자가 아닙니다.");
		}
		
	}

}
