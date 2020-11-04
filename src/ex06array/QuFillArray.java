package ex06array;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[10];
		
		int[] newnum = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			System.out.printf("%d번째 정수를 입력하세요 :", i+1);
			num[i] = scan.nextInt();
		}
		
		System.out.println("순서대로 입력된 결과");
		
		
		for(int i = 0; i < num.length; i++) {
			System.out.printf("%d  ", num[i]);
		}
		System.out.println();
		
		System.out.println("홀수/짝수 구분입력 결과");
		
		
		int start = num.length - 1;
		int last = 0;
		for(int i = 0; i < num.length ; i++) {
			
			if(num[i] %2 == 0) {
				newnum[start] = num[i];
				start --;
			}
			
			else {
				newnum[last] = num[i];
				last ++;
			}
		}
		
		for(int i = 0; i < newnum.length; i++) {
			System.out.printf("%d  ", newnum[i]);
		}
		
		
		
	}

}
