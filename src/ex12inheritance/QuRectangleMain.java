package ex12inheritance;

//직사각형을 표현한 클래스
class Rectangle
{
	int width;
	int height;
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void ShowAreaInfo() {
		System.out.println("직사각형의 면적 : " + width * height);
	}
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{
	
		int length;
		
    	public Square(int length) {
     		super(length , length);
     		this.length = length;
     	}
    	
    	@Override
    	public void ShowAreaInfo() {
    		System.out.println("정사각형의 면적 : " + length * length );
    	}
    	
} 
class QuRectangleMain
{
	public static void main(String[] args)
	{
     	Rectangle rec = new Rectangle(4, 3);
     	rec.ShowAreaInfo();

     	Square sqr = new Square(7);
     	sqr.ShowAreaInfo();
 	}
}

