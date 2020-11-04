package quiz;


class Burger {
	//멤버변수
	/* 버거명, 가격, 패티, 소스, 야체을 표현 */
	
	private String burgerName;
	private int price;
	private String patty;
	private String sauce;
	private String vegetable;
	
	//인자 생성자
	public Burger(String burgerName, int price, String patty, String sauce, String vegetable) {
		super();
		this.burgerName = burgerName;
		this.price = price;
		this.patty = patty;
		this.sauce = sauce;
		this.vegetable = vegetable;
	}
	//getter/setter : 문제에서는 price만 요구했음

	/**
	 * @return the burgerName
	 */
	public String getBurgerName() {
		return burgerName;
	}

	/**
	 * @param burgerName the burgerName to set
	 */
	public void setBurgerName(String burgerName) {
		this.burgerName = burgerName;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the patty
	 */
	public String getPatty() {
		return patty;
	}

	/**
	 * @param patty the patty to set
	 */
	public void setPatty(String patty) {
		this.patty = patty;
	}

	/**
	 * @return the sauce
	 */
	public String getSauce() {
		return sauce;
	}

	/**
	 * @param sauce the sauce to set
	 */
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	/**
	 * @return the vegetable
	 */
	public String getVegetable() {
		return vegetable;
	}

	/**
	 * @param vegetable the vegetable to set
	 */
	public void setVegetable(String vegetable) {
		this.vegetable = vegetable;
	}
	
	//햄버거 정보 출력
	public void showBuger() {
		System.out.println("burgerName");
		System.out.println("가격 : " + price);
		System.out.printf("식재료 : %s, %s, %s \n", patty, sauce, vegetable);
	}
	
	
}
//햄버거의 기본가격 추상화 
class HamburgerPrice {
	//멤버변수
	/* 햄버거종류, 음료, 프렌치프라이 */
	Burger burger;// 디폴트(default) 접근지정자로 설정
	final int COKE = 1000;
	final int POTATO = 1500;

	//인자생성자 : 상수는 이미 초기화 되어 있으므로 햄버거 객체만 초기화 한다.
	public HamburgerPrice(Burger burger) {
		this.burger = burger;
	}
	//기본가격계산 : 햄버거 + 콜라 + 프렌치프라이 가격의 합
	public int price() {
		//햄버거의 price는 private 이므로 getter를 통해 가져와야 함.
		int total = COKE + POTATO + burger.getPrice();
		return total;
	}
	
	//햄버거와 결제금액 출력
	public void showPrice() {
		burger.showBuger();
		System.out.println("결제금액 : " + price());
		System.out.println("============================");
	}
	
	
}
//세트가격을 추상화(기본가격을 상속)
class SetPrice extends HamburgerPrice {	
	//인자생성자
	public SetPrice(Burger burger) {
		super(burger);
	}
	
	//세트가격계산(오버라이딩) : 500원 할인된 가격으로 계산함
	@Override
	public int price() {
		//부모의 기본가격 계산식에서 500원 차감
		return super.price() - 500;
	}
	
	//햄버거와 세트결제금액 출력(오버라이딩)	
	@Override
	public void showPrice() {
		//디폴트 접근 지정자는 동일 패키지에서는 접근을 허용함.
		burger.showBuger();
		System.out.println("세트결제 금액 : " + price());
		System.out.println("=============================");
	}
}

public class QuBuyHamburger {

	public static void main(String[] args) {
		
		//치즈버거 객체 생성
		Burger burger1 = new Burger("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
		//치킨버거 객체 생성
		Burger burger2 = new Burger("치킨버거", 3000, "닭고기패티", "마요네즈", "양상치");
		
		//치즈버거를 기본가격으로 구매
		HamburgerPrice price1 = new HamburgerPrice(burger1); 
		price1.showPrice();	// 4500원	
		
		//치킨버거를 세트가격으로 구매
		HamburgerPrice price2 = new SetPrice(burger2); 
		price2.showPrice();	// 5000원
	}
}


