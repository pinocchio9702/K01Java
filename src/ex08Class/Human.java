package ex08Class;
/*
 시나리오] 
 다음에 주어진 조건으로 '사람'을 추상화 하시오
 -속성 : 이름, 나이, 에너지
 -행동 : 걷는다, 생각한다, 먹는다, 현재상태 표현
 -행동의 조건
 	먹으면 에너지가 2증가
 	걸으면 에너지가 1감소
 	생각하면 에너지가 2감소
 	단, 에너지의 최대/최소 범위는 0~10(사람은 무한이 먹을 수 없으며,
 	에너지가 마이너스가 되면 죽은것과 같기때문)
 */

public class Human {
	
	String name;
	int age;
	int energy;
	
	public Human(String name, int age, int energy) {
		this.name = name;
		this.age = age;
		this.energy = energy;
	}
	
	void eat() {
		if(energy >= 9) {
			energy = 10;
			System.out.println("에너지의 최대값은 10입니다. 10으로 고정됩니다.");
		}
		else {
			energy +=2;
			System.out.println("에너지가 2 증가하였습니다.");
		}
	}
	
	void walk() {
		if(energy <= 0) {
			energy = 0;
			System.out.println("energy의 최소값은 0입니다. 0으로 고정됩니다.");
		}
		else {
			energy --;
			System.out.println("energy의 값이 1 감소했습니다.");
		}
	}
	
	void thinking() {
		if(energy <= 0) {
			energy = 0;
			System.out.println("energy의 최소값은 0입니다. 0으로 고정됩니다.");
		}
		else {
			energy -= 2;
			System.out.println("energy의 값이 2 감소했습니다.");
		}
	}
	
	void showState() {
		System.out.println("=====님의 현재 상태는 ====");
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
		System.out.println("에너지 : " + energy);
		System.out.println("=======================");
	}

}
