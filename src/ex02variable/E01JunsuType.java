package ex02variable;

public class E01JunsuType {

	public static void main(String[] args) {
		
		/*
		정수 자료형
		- byte, short, int, long 타입(형)이 있다.
		-일반적으로  CUP(중앙처리장치)는 정수형을 연산 할때
			int 형을 가장 빠르게 처리한다.
		- 즉, 정수형 변수는 거의 대부분 int 형을 사용한다.
		 */
		int int1 = 100;
		int int2 = 200;
		int result1 = int1 + int2;
		
		System.out.println("int1 + int2 = " + result1);
		
		//두개의 정수를 나눠서 몫을 반환한다.
		result1 = int1 / int2;//정수와 정수의 연산이므로 정수의 결과가 나옴
		System.out.println("int1 / int2 = " + result1);
		
		/*
		-int형보다 작은 자료형을 연산하면 컴파일러는 int형으로 변환하여
		연산하다.
		-CPU가 int형의 연산에 최적화 되어있기 때문이다.
		-byte, short형은 게임케릭터의 움직임의 표현이나 음원정보등을 
		저장할때 사용한다.
		 */
		
		byte byte1 = 50, byte2 = 55;
		int result2 = byte1 + byte2; //byte + byte = int형
		System.out.println("byte1 + byte2 = " + result2);
		
		short short1 = 60, short2 = 70;
		int result3 = short1 + short2; //short + short = int형
		System.out.println("short1 + short2 = " + result3);
		
		/*
		-동일자료형끼리의 연산은 동일자료형이 되는것이 기본 원친임.
		-큰 자료형과 작은 자료형을 연산하면 큰 자료형으로 자동형변환된다.
		(데이터 손실이 있을수 있기때문)
		-단, byte와 short는 예외적인 상황으로 생각하면 된다.(int형에
		최적화된 CPU의 특성때문)
		 */
		
		long long1 = 1000, long2 = 2000;
		long result4 = int1 + long2;
		System.out.println("int1 + long1 = " + result4);
		
		result4 = long1 + long2;
		System.out.println("long1 + long2 = " + result4);
		
		//long long3 = 2200000000; => 에러발생
		long long3 = 2200000000L;
		long long4 = 2200000000l;
		
		/*
		 		자바컴파일러(CPU)는 정수형상수를 기본적으로 int형으로
		 		간주하기 떄문에 위 정수를 메모리에 올리는순간 에러가 발생한다.
		 		이때는 접미사(L 또는 l)을 붙혀서 int형 자료가 아닌 long형 
		 		자료임을 알려주야한다. 이와같이 대입을 위해 입력되는 숫자도
		 		자료형을 기반으로 메모리에 저장되고, 이를 '리터럴'이라고 한다.
		 */
		
		System.out.println("long3 = " + long3);
	}

}
