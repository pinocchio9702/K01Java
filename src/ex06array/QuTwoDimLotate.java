package ex06array;

public class QuTwoDimLotate {

	public static void main(String[] args) {
			int arr[][] = {
					{1,2,3},
					{4,5,6},
					{7,8,9}
			};
			
			
			rototeArray(arr);
			
			
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					System.out.printf("%d   ", arr[i][j]);
				}
				System.out.println();
			}
			
	}
	
	
	public static void rototeArray(int[][]  arr) {
	/*
	 절차
	 		1. 배열의 마지막행을 1차원배열 변수에 임시로 저장
	 		2. 배열의 2행을 3행으로, 1행을 2행으로 옮긴다.
	 		3. 1번에 임시로 저장했던 값을 1행으로 옮긴다.
	 		
	 		※2차원 배열에서 "배일이름[인덱스]"가 하나의 행(세로행)을
	 		가리킨다는 것을 활용하는 문제임
	 */
		
		int[] lastRow = arr[arr.length-1];
		
		for(int i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		
		arr[0] = lastRow;
		
	}
	

}
