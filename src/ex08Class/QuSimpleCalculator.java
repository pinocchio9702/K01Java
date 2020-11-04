package ex08Class;

class CalculatorEx{
	
	//맴버 변수 : 각 연산의 횟수를 카운트 하기 위한 용도
	int addCount;
	int minCount;
	int mulCount;
	int divCount;
	
	double add(double num1, double num2){
		//덧셈 연산을 수행하면 +1 증가
		addCount++;
		double result = num1 + num2;
		return result;
	}
	
	double min(double num1, double num2) {
		minCount++;
		double result = num1 - num2;
		return result;
	}
	
	double mul(double num1, double num2) {
		mulCount ++;
		double result = num1 * num2;
		return result;
	}
	
	double div(double num1, double num2) {
		divCount ++;
		double result = num1 / num2;
		return result;
	}
	
	//연산횟수를 출력하는 맴버 매소드
	void showOpCount() {
		System.out.println("덧셈 횟수 : " + addCount);
		System.out.println("뺄셈 횟수 : " + minCount);
		System.out.println("곱셈 횟수 : " + mulCount);
		System.out.println("나눗셈 횟수 : " + divCount);
	}
	
	void init() {
		addCount = 0;
		minCount = 0;
		mulCount = 0;
		divCount = 0;
	}
	
}

public class QuSimpleCalculator {

	public static void main(String[] args) {
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2)); //매개변수가 실수형인데 정수형을 넘겨도 에러가 나지 않는 이유는 
		//실수형이 더블형보다 사이즈가 크기 때문이다. 1.0, 2.0으로 전달하고 정수형으로 매개변수를 선언한다면 에러가 난다.
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();

	}

}
