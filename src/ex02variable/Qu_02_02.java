package ex02variable;

public class Qu_02_02 {

	public static void main(String[] args) {
		int kor = 99;
		int eng =80;
		int math = 96;
		
		//3으로 나누는 것과 3.0으로 나누는 것과 자료형 타입이 달라진다.
		double avg = (kor + eng + math)/3.0;
		
		System.out.println("평균점수(실수형) = " + avg);
		System.out.println("평균점수(정수형) = " + (int)avg);
		
	}

}
