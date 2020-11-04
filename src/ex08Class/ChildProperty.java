package ex08Class;

public class ChildProperty {
	int beadvalue;
	public ChildProperty(int beadvalue) {
		this.beadvalue = beadvalue;
	}
	
	public void loseBead(int lose) {
		beadvalue -= lose;
	}
	
	public void obtainBead(ChildProperty child, int obtain) {
		beadvalue += obtain;
		child.loseBead(obtain);
	}
	
	public void showProperty() {
		System.out.println("보유 구슬 개수 " + beadvalue);
	}
	
}
