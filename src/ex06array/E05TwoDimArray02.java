package ex06array;

public class E05TwoDimArray02 {

	public static void main(String[] args) {

		int [][] arr2Dim = new int[3][4];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				arr2Dim[i][j] = i + j;
			}
		}
		
		for(int n = 0; n<arr2Dim.length; n++) {
			for(int m = 0; m < arr2Dim[n].length; m++) {
				System.out.print(arr2Dim[n][m] + "  ");
			}
			System.out.println();
		}
		
		/*
		 시나리오] 다음 절차에 따라 프로그램을 작성하시오.
		 1. 2차원 배열을 선언한다. 세로2 가로4
		 2. 난수를 이용하여 배열을 초기화한다.
		 3. 배열 전체요소를 매개변수로 전달된 정수만큼
		 	증가시킨다.
		 4. 증가되기 전, 후 배열을 출력한다.
		 5. 다음 메소드명으로 구현한다. twoDimPlus()
		 */
		
		int[][] twoArray = new int[2][4];
		//세로 행 크기만큼 반복
		for(int i = 0; i < twoArray.length; i++) {
			//열 크기만큼 반복
			for(int j = 0; j < twoArray[i].length; j++) {
				//난수를 이용해서 각 요소를 초기화
				twoArray[i][j] = (int)(Math.random() * 100);
			}
		}
		
		System.out.println("==초기화 후 ============");
		showArray(twoArray);
		
		twoDimPlus(twoArray, 10);
		
		System.out.println("==메소드 호출 후 ============");
		showArray(twoArray);
		
	}
	
	//이차원 배열 출력용 함수
	static void showArray(int[][] arr2) {
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.printf("%-4d", arr2[i][j]);
			}
			System.out.println();
		}
	}
	
	//이차원 배열에 전달된 매개변수만큼 요소를 증가시키는 함수
	static void twoDimPlus(int[][] arr2, int plusNum) {
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				//매개변수로 전달된 plusNum만큼 각 요소를 증가시킴.
				arr2[i][j] += plusNum;
			}
		}
	}
	
	
	
	
	
	
	

}
