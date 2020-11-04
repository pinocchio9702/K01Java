package ex08Class;

class Car{
	
	//[맴버상수]
	public static final String AUTO = "자동";
	public static final String MANUAL = "수동";
	
	//[맴버변수]
	String carGear = AUTO;//미션
	String carModel;//모델명
	int carYear;//연식
	Human owner; // 소유주
	/*
			소유주 : Human 클래스를 기반으로 하는 맴버 벼수로
					초기화를 위해 이름, 나이, 에너지 세가지의 값이
					필요함,
					이와같이 클래스를 구성할 때 또 다른 객체를 맴버변수로
					선언할 수 있다.
	 */
	
	//맴버 메소드
	void drive() {
		System.out.println(owner.name + "이(가)" + carModel + "을 운전한다.");
	}
	
	
	/*
	 객체의 초기화를 담당하는 메소드로 아래는 항상 같은 값으로만
	 초기화 된다는 한계를 가지고 있다.
	 */
	void initialize() {
		carModel = "람보르기니";
		carYear = 2017;
		owner = new Human("캡틴로져스",30, 10);
	}
	
	/*
	 위와 동일한 이름의 함수로 오버로딩에 의해 정의된 초기화 메소드
	 초기화를 진행하는 역할은 동일하나, 메개변수를 통해 다양한
	 형태의 객체를 초기화 할 수 있다.
	 */
	void initialize(String model, int year, String name, int age, int energy) {
		carModel = model;
		carYear = year;
		owner = new Human(name, age, energy);
		/*
		 또 다른 객체가 맴버변수로 정의 되었으므로, 객체를 생성한후
		 각각의 맴버변수를 초기화 해야 한다.
		 */
	}
	
	//해당 객체의 정보를 디스플레이 해줌
	void showCarInfo() {
		System.out.println("[차량정보]");
		System.out.printf("모델명 : %s\n", carModel);
		System.out.printf("연식 : %d\n", carYear);
		System.out.printf("기어 : %s\n", carGear);
		owner.showState();
	}
	
}//end fo Car class



public class E03CarMain {

	public static void main(String[] args) {
		
		//자동차1 객체 생성
		Car car1 = new Car();
		System.out.println("[초기화메소드 호출전]");
		/*
		객체가 초기화가 되지 않았을 경우 
		변수는 null값이 반환되고 함수는 에러가 뜬다
		 */
		System.out.println("car1.owner = " + car1.owner);
		//car1.drive();
		/*
		 		에러발생(자동차 소유주를 표현하는 Human 객체가
		 		초기화 되지 않는 상태에서 출력을 시도하여 
		 		런타임 에러가 발생된다.)
		 */
		
		
		System.out.println("[초기화메소드 호출후]");
		car1.initialize(); //고정된 내용으로 초기화 진행됨
		car1.drive();
		car1.showCarInfo();
		
		//자동차2 객체 생성 : 객체생성후 맴버변수에 직접 접근하여 초기화 한다.
		Car car2 =  new Car();
		car2.carGear = Car.MANUAL;
		car2.carModel = "밴틀리";
		car2.carYear = 2018;
		
		car2.owner = new Human("토니스타크", 52, 8);
		
		System.out.println("자동차정보와 소유자 정보 같이 보기");
		car2.showCarInfo();
		
		//세번째 자동차 객체 생성 : 매개변수가 있는 초기화 메소드를 이용하여 초기화를 진행
		Car car3 =  new Car();
		car3.initialize("스포츠카", 2012, "성유겸", 8, 10);
		car3.showCarInfo();
		
		
	}

}
