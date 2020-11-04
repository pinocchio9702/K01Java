package ex04controlerstatement;

public class Qu_04_09 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j<=9; j++) {
				System.out.printf("%3d * %-3d = %3d", j,i, j*i);
			}
			System.out.println();
		}
	}

}
