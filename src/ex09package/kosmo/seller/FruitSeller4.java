package ex09package.kosmo.seller;

//과일 판매를 추상화한 클래스
public class FruitSeller4{
	int numOfApple; //판매자의 사과 보유 갯수
	int myMoney; //판매 수익
	final int APPLE_PRICE; //사과의 단가
	
	/*
	 상수는 값이 변경이 불가능하고, 단 한번만 초기화되기 때문에
	 일반적인 맴버메소드에서는 초기화 할 수 없다.
	 하지만 생성자 메소드에서는 초기화가 가능하다.
	 마음대로 호출할 수 없고, 객체생성시 단 한번만 호출되는 
	 특성이 동일하기 때문에 한번 이상 초기화 하지 않음이 보장되기
	 때문이다.
	 */
	public FruitSeller4(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}

	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	//판매자의 현재상태를 출력하는 맴버메소드
	public void showSaleResult() {
		System.out.println("[판매자] 남은 사과 개수 : " + numOfApple);
		System.out.println("[판매자] 판매수익 : " + myMoney);
	}
}
