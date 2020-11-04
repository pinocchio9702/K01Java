package ex06array;

public class QuArray1To10 {

	public static void main(String[] args) {
		int[] num = new int[10];
		
		int sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
		
		System.out.println("초기화된 배열 요소");

		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
			sum += num[i];
		}
		System.out.println();
		
		System.out.println("배열전체 요소의 합 : " + sum);
		
	}

}
