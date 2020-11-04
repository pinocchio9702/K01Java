package ex04controlerstatement;

public class E03While {
	
	/*
	 while문
	 	: 반복의 횟수가 정해져있지 않을때 주로 사용하는 반복문
	 	반복의 횟수가 명확할때는 주로 for 문을 사용한다.
	 	형식]
	 			반복을 위한 변수의 초기값 선언;
	 			while(반복의 조건){
	 				실행문';
	 				반복을 위한 변수의 즏증감식; <= 반복문 탈출을 위한
	 															++, --와 같은 연산이 필요.
	 			}
	 		반복의 조건이 false일때 while문을 탈출한다.
	 */

	public static void main(String[] args) {
		
		//누적합을 저장하기 위한 변수 선언. 증가하는 i를 누적해서 더함.
		int sum = 0;
		//반복을 위한 변수선언 및 초기화
		int i = 1;
		while(i <= 10) { //반복의 조건 설정. i가 11 이상이면 탈출.
			//증가되는 i를 sum에 누적해서 더한(1+2+3...)
			sum += i;
			//while문을 탈출하기 위한 조건을 위한 증가연산
			i++;
		}
		System.out.println("1 ~ 10까지의 합은 :" + sum);

	/*
	 시나리오] 구구단을 출력하는 프로그램을 작성하시오.
	 단 while문을 이용하시오.
	 */
	int dan = 2; //단
	while(dan < 10) { //단은 2~9까지 증가함
		int su = 1; //수(하나의 단을 출력한후 단이 증가하면 수는 1로 초기화됨)
		while(su < 10) {
			//System.out.println(dan + "*" + su + "=" + (dan*su));
			//두개의 메모리를 잡아두기위해 2를 넣고 왼쪽 정렬을 하기 위해 -을 넣는다.
			//정렬을 위한 %-d
			System.out.printf("%-2d*%-2d=%2d", dan, su, (dan*su));
			System.out.printf(" ");
			su++;
			}
		System.out.println();
		dan++;
		}
	
	/*
	 시나리오] 1부터 100가지의 정수중 3배수이거나 5배수인 수의
	 합을 구하는 프로그램을 while문을 이용해 작성하시오.
	 */
	
	int num = 1;
	int add = 0;
	
	while(num <= 100) {
		if(num % 3 == 0 || num % 5 == 0) {
			add += num;
		}
		num++;
	}
	System.out.println("3과 5의 배수의 합 : " + add);
	
	
	/*
	 시나리오] 아래와 같은 모양을 출력하는 while문을 작성하시오
	 출력결과 
	 	1 0 0 0
	 	0 1 0 0
	 	0 0 1 0
	 	0 0 0 1
	 */
	
	int k = 1;
	
	while(k <= 4) {
		int j = 1;
		while(j <= 4) {
			if(k == j) {
				System.out.printf("1 ");
			}
			else {
				System.out.printf("0 ");
			}
			j++;
		}
		System.out.println();
		k ++;
	}
	}
	
}