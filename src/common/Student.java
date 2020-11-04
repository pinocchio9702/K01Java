package common;

public class Student extends Person {
	public String stNumber;
	
	public Student(String name, int age, String stNumber) {
		super(name, age);
		this.stNumber = stNumber;
	}
	
//	@Override
//	public int hashCode() {
//		//return (name.hashCode() + age) % 3; //둘 다 비교
//		return name.hashCode()  % 3; //이름만 비교
//		//return  age % 3; //나이만 비교
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		Person comparePerson = (Person)obj;
//		System.out.println("오버라이딩한 equals()메소드 호출됨 : " + name);
//		
//		//if(comparePerson.age == this.age && comparePerson.name.equals(this.name)) {
////		if(comparePerson.age == this.age) { //나이만 비교
//		if(comparePerson.name.equals(this.name)) { //이름만 비교
//			return true;
//		}
//		else
//			return false;
//	}
	
	/*
	 toString()은 Object클래스에서 제공하는 메소드로 print()문을 통해 객체를 출력하면 자동되는 메소드이다.
	 */
	@Override
	public String getInfo() {
		return super.getInfo() + ", 학번 : " + stNumber;
	}
	
	@Override
	public void showInfo() {
		System.out.println("학생의 정보");
		System.out.println(getInfo());
	}
}
