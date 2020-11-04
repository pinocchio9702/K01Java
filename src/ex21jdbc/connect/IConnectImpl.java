package ex21jdbc.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class IConnectImpl implements IConnect {
	public Connection con;
	public PreparedStatement psmt; //동적쿼리를 처리를 위한 객체
	public ResultSet rs;
	
	//기본생성자
	public IConnectImpl() {
		System.out.println("IConnectImpl 기본 생성자 호출");
	}
	
	//인자생성자(매개변수 2개)
	public IConnectImpl(String user, String pass) {
		System.out.println("IConnectImpl 인자 생성자 호출");
		try {
			Class.forName(ORACLE_DRIVER);
			connect(user, pass);
		}
		catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	
	//인자 생성자(매개변수 3개) - 오버로딩으로 생성자 선언
	public IConnectImpl(String driver, String user, String pass) {
		System.out.println("IConnectImpl 인자 생성자 호출");
		try {
			Class.forName(driver);
			connect(user, pass);
		}
		catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	
	
	//오라클 DB에 연결
	@Override
	public void connect(String user, String pass) {
		try {
			con = DriverManager.getConnection(ORCLE_URL, user, pass);
		}
		catch(SQLException e) {
			System.out.println("데이터베이스 연결 오류");
			e.printStackTrace();
		}
	}
	
	/*
	오버라이딩의 목적으로만 정의한 메소드, 쿼리실행은 각각의 클래스에
	진행하게 될것임.
	 */
	//update랑 select할때만 사용하는 함수
	@Override
	public void execute() {
		//하는 일 없음
	}
	
	//자원 해제
	@Override
	public void close() {
		try {
			if(con!= null) con.close();
			if(psmt != null) psmt.close();
			if(rs != null) rs.close();
			System.out.println("자원 반납 완료");
		}
		catch(Exception e) {
			System.out.println("자원반납시 오류 발생");
			e.printStackTrace();
		}
	}
	/*
	 equalsIgnoreCase()
	 		: equal() 메소드와 동일하게 문자열이 같은지 비교하는 메소드로
	 		다른 점은 대소문자를 구분하지 않는다.
	 */
	
	@Override
	public String scanValue(String title) {

		Scanner scan = new Scanner(System.in);
		System.out.print(title + "을(를) 입력(exit -> 종료) :");
		String inputStr = scan.nextLine();
		/*
		 equalsIngonreCase()
		 		: 클래스를 비교하는 메소드 ingonoreCase가 붙으면 대소문자 구분없이 string을 비교한다.
		 */
		if("EXIT".equalsIgnoreCase(inputStr)) {
			System.out.println("프로그램을 종료합니다.");
			close();
			//프로그램 자체가 즉시 종료됩니다.
			System.exit(0);// 프로그램 자체가 즉시 종료
		}
		
		return inputStr; //입력받은 문자열을 반환
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
