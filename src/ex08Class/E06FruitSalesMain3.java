package ex08Class;

//과일 판매를 추상화한 클래스
class FruitSeller3{
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
	public FruitSeller3(int money, int appleNum, int price) {
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




//구매자를 표현한 클래스
class FruitBuyer3{
	int myMoney = 5000;//보유 금액
	int numOfApple = 0;//구매한 사고의 갯수
	
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
		
	}
	public void buyApple(FruitSeller3 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자] 연재잔액 : " + myMoney);
		System.out.println("[구매자] 사과갯수 : " + numOfApple);
	}
}


public class E06FruitSalesMain3 {
	
	public static void main(String[] args) {
		
		/*
		 초기화 메소드를 정의하였으므로, 각각 성격이 다른 객체들을 생성할 수 있다. 
		 */
		//판매자 1 : 보유갯수가 100개 단가 1000원
		FruitSeller3 seller1 = new FruitSeller3(0, 100, 1000);
		
		//판매자 2 : 보유갯수 80개 단가 500원
		FruitSeller3 seller2 = new FruitSeller3(0, 80, 500);
		
		FruitBuyer3 buyer = new FruitBuyer3();
		buyer.initMembers(10000, 0);
		
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		//판매자1, 판매자2에게 각각 5000원을 지불하고 구매
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}

}
