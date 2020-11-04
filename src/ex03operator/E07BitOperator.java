package ex03operator;

public class E07BitOperator {

	public static void main(String[] args) {
		
		int num1 = 5; // 0000000 0000000 0000000 0000101
		int num2 = 3; // 0000000 0000000 0000000 0000011
		int num3 = -1; // 11111111 11111111 11111111 11111111
							// 00000000 00000000 00000000 00000001 => 1
							// 1의 보수를 구해 -1를 나타낸다. 위에 두개를 더하면 0이 된다.
		
		/*
		 -1이 위와 가티 되는 이유는 1을 더했을 때 0이 되기 떄문이다.
		 양의 정수 1을 2의 보수를 취하면 -1이 된다.
		 */
		
		System.out.println("비트AND : " + (num1 & num2));
		System.out.println("비트OR : " + (num1 | num2));
		System.out.println("비트XOR : " + (num1 ^ num2));
		System.out.println("비트NOT : " + (~num3));
	}

}
