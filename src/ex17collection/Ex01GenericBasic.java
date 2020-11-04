package ex17collection;

//오렌지를 표현한 클래스
class Orange{
	int sugar;
	public Orange(int sugar) {
		this.sugar = sugar;
	}
	public void showInfo() {
		System.out.println("오랜지의 당도는  " + sugar + "입니다.");
	}
}
//오랜지 전용박스 : Orange객체만 저장할 수 있는 클래스
class OrangeBox{
	Orange item;
	public void store(Orange item) {
		this.item = item;
	}
	public Orange pullOut() {
		return item;
	}
}
//과일 상자 : Object기반으로 모든 객체(과일)를 저장할 수 있는 클래스
class FruitBox{
	Object item;
	public FruitBox(Object item) {
		this.item = item;
	}
	//담다
	public void store(Object item) {
		this.item = item;
	}
	//꺼내다
	public Object pullOut() {
		return item;
	}
}


public class Ex01GenericBasic {
	/*
	 OrangeBox에 Orange객체를 생성한 후 저장하고 정보를 출력함
	 */
	public static void main(String[] args) {
		
		OrangeBox  oBox1 = new OrangeBox();
		Orange orange1 = new Orange(10);
		oBox1.store(orange1);
		orange1 = oBox1.pullOut();
		orange1.showInfo();
		
		/*
		 상자 1은 오랜지 전용박스이므로 다른과일(즉 객체)를 저장할 수 없다.
		 컴파일 에러가 발생하므로 실행자체가 불가능하다.
		 -> 즉 자료형에는 안전하지만, 구현에는 불편함이 있다.
		 다른 객체를 저장하기 위해서는 또다른 Box클래스를 생성해야한다.
		 */
		//oBox1.store("당도가 20인 오랜지"); <-컴파일에러발생
//		Orange orange2 = oBox1.pullOut();
//		orange2.showInfo();
//		
		/*
		 Object를 기반으로 한 FruitBox는 구현에는 편리하나 코드레벨에서
		 컴파일에러가 발생하지 않으므로, 오류를 찾아내기 훨씬 힘들다.
		 따라서 자료형에서는 안전하지 못한 코드가 된다.
		 */
		FruitBox fBox1 = new FruitBox(new Orange(20));
		Orange orange3 = (Orange)fBox1.pullOut();
		orange3.showInfo();
		
		FruitBox fBox2 = new FruitBox("당도가 30인 오렌지");
		Orange orange4 = (Orange)fBox2.pullOut();//<-런타임에러(예외) 발생
		orange4.showInfo();
	}
	
}
