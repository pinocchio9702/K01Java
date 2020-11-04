package ex08Class;

/*
 해당 예제에서는 Human클래스를 외부 파일로 선언하였다.
 동일한 패키지에 정의된다면 컴파일러는 해당 클래스를 찾아서 
 즉시 객체(인스턴스)화 할 수 있다. 
 만약 다른 패키지에 선언된 클래스라면 반드시 import선어을 해줘야 한다.
 */
public class E02HumanMain {

	public static void main(String[] args) {
		Human human = new Human("피노키오", 24, 7);
		
		human.showState();
		human.eat();
		human.thinking();
		human.showState();
		
		for(int i = 1; i <= 20; i++) {
			human.walk();
		}
		
		for(int i = 1; i<=20; i++) {
			human.eat();
		}
		
		human.showState();
	}
}
