package ex06array;

import java.util.Scanner;

public class QuSungJuk {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("학생수를 입력하세요 : ");
		int studentNum = scan.nextInt();
		
		int[][] studentGrade = new int[studentNum][3];
		
		for(int i = 0; i < studentGrade.length; i++) {
			System.out.printf("[%d번째 학생의 점수 입력]", i+1);
			System.out.println();
			System.out.printf("국어점수 입력?");
			studentGrade[i][0] = scan.nextInt();
			System.out.printf("영어점수 입력?");
			studentGrade[i][1] = scan.nextInt();
			System.out.printf("수학점수 입력?");
			studentGrade[i][2] = scan.nextInt();
			
		}
		
		int[] total = new int[studentNum];
		double[] avg = new double[studentNum];
		
		for(int i = 0; i < total.length; i++) {
			for(int j = 0; j <studentGrade[i].length; j++) {
				total[i] += studentGrade[i][j];
			}
			avg[i] = total[i]/3.0;
		}
		
		System.out.println("========================");
		System.out.println("NO KOR ENG MAT TOT AVG");
		for(int i = 0; i < studentGrade.length; i++) {
			System.out.printf("%3d %3d %3d %4d %4d %6.2f", i+1, studentGrade[i][0],studentGrade[i][1],studentGrade[i][2],total[i],avg[i]);
			System.out.println();
			
		}
		
		
		
	}

}
