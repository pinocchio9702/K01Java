package ex09package.kosmo.buyer;

import ex09package.kosmo.seller.FruitSeller4;

//구매자를 표현한 클래스
public class FruitBuyer4{
	int myMoney = 5000;//보유 금액
	int numOfApple = 0;//구매한 사고의 갯수
	
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
		
	}
	public void buyApple(FruitSeller4 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자] 연재잔액 : " + myMoney);
		System.out.println("[구매자] 사과갯수 : " + numOfApple);
	}
}
