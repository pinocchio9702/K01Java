package ex04controlerstatement;

public class Qu_04_06 {

	public static void main(String[] args) {
		int i = 1;
		while(i <= 5) {
			int j = 1;
			while(j <= i) {
				System.out.printf("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
