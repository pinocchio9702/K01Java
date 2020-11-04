package ex04controlerstatement;

import java.util.Scanner;

public class Qu_04_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int kor, eng, math, Switchavg;

		int avg;
		
			System.out.printf("국어 점수 : ");
			kor = scanner.nextInt();
			System.out.printf("영어 점수 : ");
			eng = scanner.nextInt();
			System.out.printf("수학 점수 : ");
			math = scanner.nextInt();
			
			
			avg = (kor+eng+math) / 3;
			
			Switchavg = avg / 10;
			
			System.out.println("평균 점수:" + avg);
			
			switch(Switchavg) {
			case 10: case 9:
				System.out.println("A학점"); break;
			case 8 :
				System.out.println("B학점"); break;
			case 7 :
				System.out.println("C학점"); break;
			case 6 :
				System.out.println("D학점"); break;
			default :
				System.out.println("F학점"); 
			}

	}

}
