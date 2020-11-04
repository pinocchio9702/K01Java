package common;

public class Person {
	public String name;
	public int age;
	public Person() {
		
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		//return (name.hashCode() + age) % 3; //둘 다 비교
//		return name.hashCode()  % 3; //이름만 비교
		return  age % 3; //나이만 비교
	}

	@Override
	public boolean equals(Object obj) {
		Person comparePerson = (Person)obj;
		//System.out.println("오버라이딩한 equals()메소드 호출됨");
		
		if(comparePerson.age == this.age && comparePerson.name.equals(this.name)) {
//		if(comparePerson.age == this.age) { //나이만 비교
//		if(comparePerson.name.equals(this.name)) { //이름만 비교
			return true;
		}
		else
			return false;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	//객체의 정보 반환용 메소드
	public String getInfo() {
		return String.format("이름 : %s , 나이 : %s", name, age);
	}
	//객체의 출력용 메소드
	public void showInfo() {
		System.out.println(getInfo());
	}
	
	
	
	
	
	
	
}
