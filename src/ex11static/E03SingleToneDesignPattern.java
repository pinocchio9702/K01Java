package ex11static;
/*
 싱글톤 디자인 패턴
 			: 클래스를 설계하는 디자인 패턴의 하나로써 하나의
 			인스턴스 즉 하난의 메모리를 생성해 이를 공유해서
 			사용하고자 할 때 사용하는 패턴이다.
 			
 			작성방법
 			1. 생성자의 접근지정자를  private으로 정의한다.
 			2. 외부 클래스에서 생성자를 접근할 수 없으므로 new를 통해
 			객체생성은 불가능 하다.
 			3. 클래스 내부에 정적메소드로 해당 클래스의 객체를 반환하도록 정의한다.
 			(getInstanc())
 			4. 위 방법을 통해 객체를 생성하면 메모리에 딱 하나만 만들어 지게 된다.
 */
class NoSingleTone{
	int instVar;
	public NoSingleTone() {
		
	}
}

//싱글통 패턴이 적용된 클래스
class SingleTone{
	int shareVar;
	/*
	 Jvm(자바가상 머신)에 의해 프로그램이 시작될때 정적변수는 미리 메소드영역에
	 생성되어 사용할 준비를 마치게 된다.
	 */
	private static SingleTone single = new SingleTone();
	/*
	 생성자를 private으로 선언하면 클래스 외부에서는 호출 할 수 없으므로 
	 new 연산자를 통해서는 객체를 생성할 수 없게 된다.
	 */
	private SingleTone() {
		// TODO Auto-generated constructor stub
	}
	
	
	/*
	 정적 메소드로 해당 클래스의 객체를 외부로 반환한다.
	 */
	public static SingleTone getInstance() {
		return single;
	}
	
	void print() {
		System.out.printf("shareVar=%d", shareVar);
		System.out.println();
	}
	
}


public class E03SingleToneDesignPattern {

	public static void main(String[] args) {
		
		/*
		 일반적인 방식의 객체 생성이므로 객체를 생성할 때마다
		 새로운 참조값을 할당받는 인스턴스가 된다.
		 */
		NoSingleTone nst1 = new NoSingleTone();
		nst1.instVar = 100;
		System.out.println("nst1 = " + nst1);
		
		NoSingleTone nst2 = new NoSingleTone();
		nst2.instVar = 200;
		System.out.println("nst2 = " + nst2);
		
		//생성자가 private이므로 외부에서는 접근 불가능
		//SingleTome st1 = new SignleTome(); [오류발생]
		
		/*
		생성자를 접근할 수 없는 대신 getInstance() 메소드를 통해서만
		객체의 참조값을 반환받을 수 있다. 받환받을 때는 항상 같은 객체반환받게 된다.
		 */
		SingleTone st2 = SingleTone.getInstance();
		st2.shareVar = 100;
		st2.print();
		
		SingleTone st3 = SingleTone.getInstance();
		st3.shareVar = 200;
		st3.print();
		
		//두 객체의 조수값은 동일하다.
		System.out.println(String.format("st2의 주소 : %s", st2));
		System.out.println(String.format("st3의 주소 : %s", st3));
		
		System.out.println(String.format("st2의 sharVar : %d", st2.shareVar));
		System.out.println(String.format("st3의 sharVar : %d", st3.shareVar));
		
		
		
		
		
		
		
	}

}
