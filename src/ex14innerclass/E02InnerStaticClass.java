package ex14innerclass;

/*
 내부 정적 클래스
 		: 클래스 안에 정의하는 클래스로 static을 붙여준다.
 		- 이와 같이 내부클래스를 static으로 선어하면 Nested 클래스라고 한다.
 		- 정적 멤버변수 & 멤버메소드를 가질 수 있다.
 		- 외부 클래스의 인스턴스형 멤버는 사용할 수 없다.
 		- 외부 클래스명$내부클래스명.class 파일이 생성된다.
 		
 		※원래 class 앞에는 static을 붙일수 없으나 내부 클래스에서는 허용된다.
 */
class OuterClass {
	
	//인스턴스형 멤버변수
	InnerStaticClass innerStaticClass = new InnerStaticClass();
	int outerMemberVar;
	
	
	//인스턴스형 멤버메소드
	void outerMemberMethod() {
		/*
		 외부클래스의 멤버메소드에서는 내부정적클래스의 멤버를 접근할 수 있다.
		 (Heap영역에서는 Method영역을 참조할 수 있다.)
		 */
		System.out.println("외부 클래스의 멤버메소드 호출됨");
		innerStaticClass.innerMemberVar = 100; //내부정적클래스의 멤버변수
		innerStaticClass.innerStaticVar = 101; //내부정적클래스의 정적멤버변수
		
	}
	//외부 클래스의 정적멤버&메소드
	static int outerStaticVar;
	static void outerStaticMethod() {
		System.out.println("외부 클래스의 정적메소드 호출됨");
		
		/*
		 외부클래스의 정적멤버메소드에서는 내부클랫으이 정적멤버만 접근할 수 있다.
		 (Method영역에서는 Heap영역을 참조할 수 있다.)
		 */
		//InnerStaticClass.innerMemberVar = 102;
		//InnerStaticClass.innerMemberMethod();
		
		InnerStaticClass.innerStaticVar = 103;	
		InnerStaticClass.innerStaticMethod();
		
		//InnerStaticClass.innerMemberVar = 104;
		//InnerStaticClass.innerMemberMethod();
		
	}
	
	//내부 정적 클래스(Nested Class)
	static class InnerStaticClass {
		//인스턴스형 멤버
		int innerMemberVar;
		void innerMemberMethod() {
			System.out.println("내부클래스의 멤버메소드 호출");
		}
		
		//정적 멤버
		static int innerStaticVar;
		static void innerStaticMethod() {
			System.out.println("내부클래스이 정적메소드 호출");
		}
		
		
	}
	
}

//외부클래스가 아닌  다른 클래스에서 접근할 때의 방법은 아래와 같다.
public class E02InnerStaticClass {

	public static void main(String[] args) {
		
		/*
		 내부정적 클래스의 정적멤버에 접근할 때는 외부클래스의 객체 생성없이
		 클래스 명으로 바로 접근 가능한다.
		 */
		OuterClass.InnerStaticClass.innerStaticVar = 1;
		OuterClass.InnerStaticClass.innerStaticMethod();
		/*
		 내부정적 클래스의 인스터늣형 멤버에 접근할 때는 객체를 생성한 후 참조변수를 통해 접근해야 한다.
		 */
		OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
																					//new OuterClass().InnerStaticClass(); 에러발생
		innerStaticClass.innerMemberVar = 2;
		innerStaticClass.innerMemberMethod();
		/*
		 그 외는 클래스 접근의 일반적인 방법을 따른다.
		 외부클래스의 멤버변수(메소드)는 객체생성 후 참조변수를 통해
		 접근한다.
		 */
		OuterClass outerClass = new OuterClass();
		outerClass.outerMemberVar = 3;
		outerClass.outerMemberMethod();
		
		//외부 클래스의 정적맴버는 클래스명으로 바로 접근한다.
		OuterClass.outerStaticVar = 4;
		OuterClass.outerStaticMethod();
	}
}

















