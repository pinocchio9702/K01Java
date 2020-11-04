package ex04controlerstatement;

import java.io.IOException;

public class Qu_04_02 {

	public static void main(String[] args) throws IOException {
		int user;
		
		System.out.printf("하나의 문자를 입력하세요 : " );
		
		user = System.in.read();
		
		System.out.println((user >= 48 && user <=57) ? "숫자입니다." : "숫자가 아닙니다."); 
	
	}

}
