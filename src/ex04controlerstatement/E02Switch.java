package ex04controlerstatement;

import java.util.Scanner;

public class E02Switch {
	
	/*
	 switch문
	 	if문처럼 조건에 따라 분기하는 제어문으로
	 	정수식의 값과 동일리한 부분을 찾아 실행하는 형태
	 	형식]
	 		switch(정수식 or 산술식){
	 		case 1:
	 			실행문 1; break;
	 		case 2:
	 			실행문 2; break;
	 		default:
	 			위의 값과 매칭되지 않을 때 실행되는 문장.
	 			else와 같은 의미임
	 		}
	 	-switch문 내부에서 break문을 만나게되면 실행이 중지되고
	 	블럭밖으로 탈출하게 된다.
	 */

	public static void main(String[] args) {
		
		/*
		 Scanner클래스
		 		: JDK5.0에 추가된 클래스로 키보드를 통해 사용자로부터
		 		값을 입력 받을때 사용함
		 		nextInt() : 정수를 입력받음
		 		nextLine() : 문자열을 입력받음
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int iNum = scanner.nextInt();
		System.out.println("입력한 숫자는 : " + iNum);
		
		int remain = iNum % 3;
		
		switch(remain) {
		case 0 : 
			System.out.println("나머지는 0입니다.");
			break; //switch문에서 break문을 만나면 탈출하게 된다. 해당 불록을 탈출한다.
		case 1 : 
			System.out.println("나머지는 1입니다.");
			break;
		default : 
			System.out.println("나머지는 2입니다.");
		}
		
		/*
		 switch문 사용시 주의사항
		 -long타입의 변수는 사용이 불가능 합니다.
		 -byte/short/int/char/String 만 사용할수 있다.
		 -논리식도 사용이 불가능하다.
		 */
		
//		long ln = 100;
//		switch(ln) {
//		case 100:
//			System.out.println("long타입 사용??");
//		default : 
//			System.out.println("안되는군!");
//		}
//	switch(iNum%3==0) {
//			
//}
	
		//문자열이나 문자는 switch문에서 사용이 가능하다.
		String title = "자바";
		switch(title) {
		case "자바" : System.out.println("자바 좋아");
			break;
		case "JAVA" : System.out.println("JAVA Goooood"); 
			break;
		}
		
		/*
		 여러가지 case를 동시에 처리할때는 break문 없이 case를 나열한다.
		 if문에서 ||(논리OR)를 사용한것과 동일하다.
		 */
		
		int season = 4;
		switch(season) {
		case 3: case 4: case 5:
			System.out.println("봄입니다.");
			break;
		case 6: case 7: case 8: case 9:
			System.out.println("여름입니다.");
			break;
		case 10:
			System.out.println("가을입니다.");
			break;
		case 11: case 12: case 1: case 2:
			System.out.println("겨울입니다.");
		}
		
	}

}
