package ex10accessmodifier.sub;


class DefaultClass2{
	void myFunc() {
		System.out.println("DefaultClass 클래스의 myFunc() 메소드 호출");
	}
}

/*
public 클래스는 해당 java파일을 대표하는 클래스로 파일명과 동일하고
다른 패키지에서도 접근이 가능하다. public클래스는 하나의 자바파일에 
하나만 정의할 수 있다.
*/
public class E01AccessModifier2 {
	//맴버변수를 각각의 접근지정자를 통해 선언
	private int privateVar;
	int defaultVar;
	public int pulicVar;
	
	/*
	동일 클래스내에서 private 맴버라 할지라도 접근이 가능한다.
	즉 동일 클래스면 접근 지정자에 영향을 받지 않는다.
	 */
	private void privateMethod() {
		privateVar = 100;
		System.out.println("privateMethod() 메소드 호출");
	}
	
	void defaultMethod() {
		privateVar = 200;
		System.out.println("defaultMethod() 메소드 호출");
	}
	
	public void publicMethod() {
		privateVar = 300;
		System.out.println("publicMethod() 메소드 호출");
		privateMethod();
	}
}
