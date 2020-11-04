package ex08Class;

//과일 판매를 추상화한 클래스
class FruitSeller2{
	int numOfApple; //판매자의 사과 보유 갯수
	int myMoney; //판매 수익
	int apple_price; //사과의 단가
	/*
	상수에서 변수로 변경함.
	클래스의 맴버상수로 정의하는 경우 선언과 동시에 초기화해야 하므로 상수는 초기화 없는
	형태로는 선언이 불가능함.
	 */
	
	/*
	 apple_price를 상수에서 변수로 변경한 이유는 상수는 단 한번만
	 초기화 되는 특성 때문에 일반적인 맴버메소드 내에서는 초기화 할 수 없다.
	 맴버 메소드는 개발자가 원할때 언제든지 호출 할 수 있으므로, 상수의 특정과는
	 맞지 않기 때문이다.
	 */
	public void initMembers(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		apple_price = price;
	}

	public int saleApple(int money) {
		int num = money / apple_price;
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
class FruitBuyer2{
	int myMoney = 5000;//보유 금액
	int numOfApple = 0;//구매한 사고의 갯수
	
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
		
	}
	public void buyApple(FruitSeller2 seller1, int money) {
		numOfApple += seller1.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자] 연재잔액 : " + myMoney);
		System.out.println("[구매자] 사과갯수 : " + numOfApple);
	}
}


public class E06FruitSalesMain2 {
	
	public static void main(String[] args) {
		
		/*
		 초기화 메소드를 정의하였으므로, 각각 성격이 다른 객체들을 생성할 수 있다. 
		 */
		//판매자 1 : 보유갯수가 100개 단가 1000원
		FruitSeller2 seller1 = new FruitSeller2();
		seller1.initMembers(0, 100, 1000);
		
		//판매자 2 : 보유갯수 80개 단가 500원
		FruitSeller2 seller2 = new FruitSeller2();
		seller2.initMembers(0, 80, 500);
		
		
		FruitBuyer2 buyer = new FruitBuyer2();
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
