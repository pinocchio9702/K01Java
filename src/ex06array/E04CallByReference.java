package ex06array;

/*
 Call By Reference(참조의 의한 호출)
 		: 메소드를 호출할 때 참조값을 전달함으로써 서로 다른
 		지역에서도 동일한 메모리(힙영역)를 참조할 수 있게 하는
 		호출 방식이다.
 		메소드의 지역이 다르더라도 참조값을 통해 참조하게 되므로
 		A영역에서의 값의 변경을 B영역에서도 그대로 참조할 수 있는 장점이 있다.
 		메모리도 절약할 수 있다.
 */

public class E04CallByReference {

	public static void main(String[] args) {
		int[] arr = {100, 200};
		
		System.out.println("[메인메소드] - Swap전 출력");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}
		System.out.println();
		
		callByReference(arr);
		
		System.out.println("[메인메소드] - Swap후 출력");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}
	}
	
	static void callByReference(int[] ref) {
		int temp;
		temp = ref[0];
		ref[0] = ref[1];
		ref[1] = temp;
		
		System.out.println("[callByValue 메소드 안] ref[0]=" + ref[0] + ", ref[1] = " + ref[1]);

	}
	
}
