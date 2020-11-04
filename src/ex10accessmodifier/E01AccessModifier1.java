package ex10accessmodifier;


/*
 class를 정의할 때는 반드시 public과 default(생략형)만
 사용해야한다.
 */
//private class PrivateClass1 {
//	void myFunc() {
//		System.out.println("나는 정의할 수 없는 Class");
//	}
//}

/*
 접근지정자를 생략했으므로 default클래스로 지정된다.
 해당 클래스는 동일 패키지 내에서만 접근 가능한다.
 */
class DefaultClass1 {
	void myFunc() {
		System.out.println("DefalutClass클래스의 myFunc()메소드 호출");
	}
}

public class E01AccessModifier1 {

	private int privateVar;
	int defaultVar;
	public int pulicVar;
	
	private void privateMethod() {
		privateVar = 100;
		System.out.println("privateMethod() 메소드 호출");
	}
	
	void defaultMethod() {
		privateVar = 200;
		System.out.println("defaultMethod() 메소드 호출");
	}
	
	
	/*
	 private으로 선언된 맴버(변수 혹은 메소드)를 외부 클래스에서 접근하고 싶을때 public으로 선언된 
	 맴버메소드를 이용해서 간접적으로 접근 할 수 있다.
	 */
	public void publicMethod() {
		privateVar = 300;
		System.out.println("publicMethod() 메소드 호출");
		privateMethod();
	}
	
}
