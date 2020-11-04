package ex17collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Avengers {
	String name;
	String heroName;
	String weapon;

	public Avengers(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}

	/*
	 객체에게 부여된 조소값(참조값)을 숫자형태로 반환해주는 메소드
	 */
	@Override
	public int hashCode() {
		int hc1 = name.hashCode();
		int hc2 = heroName.hashCode();
		int hc3 = weapon.hashCode();
		/*
		 해당객체가 보유한 모든 맴버변수를 이용해서 해시값을 구하고 연산(사칙연산 뭐든지...)하여 
		 결과를 반환한다.
		 */
		return hc1+hc2+hc3;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("중복제거용 equals() 메소드 호출");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avengers other = (Avengers) obj;
		if (heroName == null) {
			if (other.heroName != null)
				return false;
		} else if (!heroName.equals(other.heroName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weapon == null) {
			if (other.weapon != null)
				return false;
		} else if (!weapon.equals(other.weapon))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", "
				+ "능력=" + weapon +"]";
	}
}

public class QuHashSet {

	public static void main(String[] args) {
		
		int checkfind = 0;
		
		Scanner scan = new Scanner(System.in);

		HashSet<Avengers> set = new HashSet<Avengers>();

		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);		 

		System.out.println("[최초 전체 정보출력]");
		for(Avengers av : set)
		{
			System.out.println(av.toString());			
		}
		
		System.out.print("검색할 이름을 입력하세욤 : ");
		String name = scan.nextLine();
		
		Iterator<Avengers> itr = set.iterator();
		while(itr.hasNext()) {
			Avengers aven = (Avengers) itr.next();
			
			if(aven.name.equals(name)) {
				System.out.println(aven.toString());
				System.out.println("요청하신 정보를 찾았습니다.");
				checkfind = 1;
			}
		}
		
		if(checkfind == 0) {
			System.out.println("해당 영웅은 없어요 ㅜㅜ");
		}
		
	}
}

