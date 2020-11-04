package ex18lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/*
 JAVA에서 제공하는 기본 함수형 인터페이스는 다음과 같은 종류가 있다.
 큰 차이점이라면 매개변수의 유뮤, 리턴값의 유무 정도이다.
 
 Predicate : 매개변수있고 리턴은 boolean값
 Consumer: 매개변수 있고 리턴값 없음
 Supplier : 매개변수 없고, 리턴값 있음
 Function: 매개변수 없고, 리턴값 없음
 */

public class Ex06Define1Predicate {

	public static void main(String[] args) {
		/*
		 Predicate
		 - 사전적 의미 : ~에 근거를 두다
		 - 매개변수와 boolean리턴값이 있는 test()계열의 추상메소드를 가지고 있다.
		 - 파라미터를 조사해 true or false값을 리턴한다.
		 */
		Human p1 = new Human("케이윌", "남", 80);
		Human p2 = new Human("에일리", "여", 77);
		
		/*
		 interface Predicate<E> {
		 	boolean test(T t):
		 }
		 */
		
		/*
		 전달된 객체의 성별이 "남" 인지 판단하여 boolean값을 반환하는 람다식 정의함.
		 test() 메소드를 오버라이딩하여 정의하였으므로 아래와 같이 호출 할 수 있다.
		 */
		
		//test를 오버라이딩한 람다식
		Predicate<Human> pre = (Human h) -> {
			return h.getGender().equals("남");
		};
		
		System.out.println("p.test(p1)" + pre.test(p1));
		System.out.println("p.test(p2)" + pre.test(p2));
		
		System.out.println("====================================");
		 
		Human p3 = new Human("임재범", "남",  97);
		Human p4 = new Human("아이유", "여",  99);
		
		//일반적인 배여을 List 컬렉션으로 변경해주는 메소드
		List<Human> list1 = Arrays.asList(p1, p2, p3, p4);
		
		/*
		(Human a) -> {
				a.getGender().equals("남")
		}
		이와 같은 람다식을 간소화하면 아래와 같이 기술할 수 있다.
		- 매개변수의 타입을 유추할 수 있어 생략하고
		- 실행문장이 하나라서 {}를 생략하였다.
		 */
		
		
		//람다식 자체를 매개변수로 전달
		//매개변수 객체가 남자일때 true를 반환하는 람다식을 전달함
		
		/*
		 	Predicate<Human> pre = (Human a) -> {
			return a.getGender().equals("남");
		};
		
		이것이 a -> a.getGender().equals("남")의 타입이 Predicate<Human>인 이유이다. 저걸 생략한 람다식이니 당연히 반환 타입은 Predicate<Human>이 된다. 기억하자
		 */
		double maleAvg = avg(a -> a.getGender().equals("남"), list1);
		//double maleAvg = avg(pre.equals("남"), list1); => 똑같은 결과 출력
		
		System.out.println("남자 평균 :" + maleAvg);
		
		double femaleAvg = avg((Human b) -> b.getGender().equals("여"), list1);
		
		System.out.println("여자 평균" + femaleAvg);
		
		List<Integer> list = Arrays.asList(1,3,5,7,9,11,12,14);
		
		/*
		 주어진 인자가 짝수인지 홀수인지 판단하여 true를 반환하는 람다식을 
		 매개변수로 전달한다. 
		 */
		int total;
		
		/*
		Predicate<Integer> pre = (Integer a) ->
		 */
		
		total = sum((Integer n) -> n%2 == 0, list);
		System.out.println("짝수합:" + total);
		
		total = sum((Integer n) -> n %2 != 0, list);
		System.out.println("홀수합 :" + total);
			
	}
	
	public static int sum(Predicate<Integer> p, List<Integer> list) {
		int sum = 0;
		for(int a : list) {
			if(p.test(a)) {
				//test()를 통해 홀/짝 여부를 판단한다.
				sum += a;
			}
		}
		return sum;
	}
	
	
	/*
	 매개변수로 성별을 판단하는 람다식과 List컬렉션을 전달받아서
	 평균값을 반환하는 메소드
	 */
	public static double avg(Predicate<Human> ph, List<Human> li) {
		int pCount = 0; //전달된 객체의 성별을 판단하여 인원수를 카운트
		int tCount = 0; //점수를 누적해서 더해 총점을 저장하기 위한 변수
		for(Human h : li) { //li컬렉션의 크기만큼 반복
			/*
			 첫번째 호출에서는 남자일때 true를 반환하므로
			 남자의 인원수와 점수가 카운트 된다.
			 */
			if(ph.test(h) ==true) {
				pCount++;
				tCount += h.getScore();
			}
		}
		return (double) tCount/ pCount; //편균값을 계산 후 반환
	
	}
	
	
	

}
