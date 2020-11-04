package ex21jdbc.connect;

public interface IConnect {
	/*
	맴버 상수 
			: 인터페이스에서 선언된 변수는 무조건 public static final이 
			붙어 정적상수로 선언된다. 
	 */
	//인터페이스 변수를 선언하면 스테틱 상수가됨
	String ORACLE_DRIVER = "oracle.jdbc.OracleDriver";
	String ORCLE_URL = "jdbc:oracle:thin://@localhost:1521:orcl";
	
	/*
	멤버 추상 메소드 
			: public abstract가 붙어 추상메소드로 선언된다.
	 */
	//생성된 함수는 반드시 오버라이딩 해야함
	void connect(String user, String pass) ;//DB연결
	void execute(); //쿼리 실행
	void close(); //자원 반납
	
	//사용자 입력을 위한 추상메소드 선언
	String scanValue(String title);
	
	
}
