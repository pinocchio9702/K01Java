package ex17collection;

import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

public class QuArrayList {

	public static void main(String[] args) {

		//int check = 0;
		Scanner scan = new Scanner(System.in);

		// ArrayList<Student> list = new ArrayList<Student>();
		LinkedList<Student> list = new LinkedList<Student>();

		// 저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");

		// 객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);

		// 1.검색할 이름을 입력받음
		System.out.print("검색할 이름을 입력하세요 : ");
		String name = scan.nextLine();
		
		int index = -1;//배열(컬렉션)의 인덱스는 0부터 시작이므로 초기값은 -1로 설정

		// !!!!!!!!!!!!!!!!!! 나길동으로 하면 equal함수가 2번 다길동으로 하면 equal함수가 3번 마길동으로 하면
		// equal함수가 4번 호출되는 오류 해결 못함
		// 2.확장for문으로 컬렉션 전체를 접근
		for (Student st : list) {
			// 3.검색결과 유/무에 따라
			// 검색결과 있을때…검색된 데이터 삭제
//			if (st.name.equals(name)) {
//				System.out.println("[검색되었습니다.]");
//				index = list.indexOf(st);
//				list.remove(index);
//				check = 1;
//				break;
//			}
			
			//리뷰 후 코딩
			if(name.equals(st.name)) {
				System.err.println("검색결과 있음");
				System.err.println("객체 삭제후 정보 출력");
				//객체의 참조값을 통해 List내의 index값을 찾음
				index = list.indexOf(st);
				//해당 객체를 찾았으면 즉시 루프 탈출
				break;
			}
		}

		// 검색결과 없을때...검색결과가 없다고 출력
		if (index == -1) {
			System.out.println("[검색결과가 없습니다.]");
		}
		else {
			/*
			 컬렉션에 저장된 객체를 인덱스를 통해 삭제하면 
			 삭제된 객체 자체를 반환하게 되므로 맴버메소드를 바로 호출할 수 있다.
			 */
			list.remove(index).showInfo();
		}

		// 4.전체정보 출력
		System.out.println("==========[삭제후 정보 출력]==========");
		for (Student st : list) {
			System.out.println(st.getInfo());
		}
	}
}
