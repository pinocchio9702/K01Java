package quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class QuBaseballGame {

	//서로 다른 랜덤수를 배열에 넣는 함수
	public static int[] randomNum() {
		Random rand = new Random();
		int[] num = new int[3];
		

		for (int i = 0; i < num.length; i++) {
			num[i] = rand.nextInt(9) + 1;
		}

		
		for(int i = 0; i < num.length; i++) {
			int numCheck = 0;
			while(numCheck < num.length) {
				if(i == numCheck) {
					numCheck++;
					continue;
				}
				if(num[i] == num[numCheck]) {
					num[numCheck] = rand.nextInt(9) + 1;
					continue;
				}
				else {
					numCheck++;
				}
			}
		}

		return num;
	}

	public static void basegame() {

		Scanner scan = new Scanner(System.in);

		int[] user = new int[3];
		int[] com = new int[3];
		
		int gameCount = 0;
		
		int regame;
		
		
		while (true) {
			if(gameCount == 0) {
				com = randomNum();
			}
			System.out.println("test용 컴퓨터 숫자 표시");
			for(int i = 0; i < com.length; i++) {
				System.out.print("  " + com[i]);
			}
			int strike = 0;
			int ball = 0;
			System.out.println();
			for (int i = 0; i < user.length; i++) {
				try {
					System.out.println(i + 1 + "번 숫자를 입력하세요");
					user[i] = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("숫자만 입력해야 합니다.");
				}
			}////end of for

			for (int i = 0; i < com.length; i++) {
				if (com[i] == user[i]) {
					strike++;
				}
				else if(com[i] != user[i]){
					for(int j = 0; j < user.length; j++) {
						if(i != j) {
							if(com[i] == user[j]) {
								ball++;
							}
						}
					}
				}
			}////end of for

			if(strike == 0 && ball == 0) {
				System.out.println("out입니다.");
				gameCount ++;
			}
			else if(strike != 3) {
				System.out.println(strike + "스트라이크 " + ball + "볼 입니다.");
				gameCount ++;
			}
			else if(strike == 3) {
				System.out.println("3스트라이크 입니다~~~ 축하드립니다. " + gameCount + "번만에 게임을 끝냈습니다.");
				while (true) {
					System.out.print("게임재시작(1), 종료(0):");
					regame = scan.nextInt();
					if (regame == 0 || regame == 1) {
						// 정상입력이면 루프탈출
						break;
					} else {
						System.out.println("잘못입력해씸ㅜㅜ\n");
					}
				}
				if (regame == 0) {
					// 게임종료를 위해 while루프 탈출
					break;
				} else {
					System.out.println("게임 재시작^^");
					gameCount = 0;
				}
				
			}
		}////end of while

	}//end of Method

	public static void main(String[] args) {
		basegame();
		
	}
}

