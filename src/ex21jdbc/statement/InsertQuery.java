package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {

	//맴버변수
	Connection con; //DB연결을 위한 객체
	Statement stmt;//쿼리전송 및 실행을 위한 객체
	
	public InsertQuery() {
		try {
			//1.오라클 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			//2. 커넥견 객체를 통해 DB연결
			con = DriverManager.getConnection(
					"jdbc:oracle:thin://@localhost:1521:orcl",
					"kosmo",
					"1234");
			System.out.println("오라클 DB 연결 성공");
		}
		catch(ClassNotFoundException e) {
			//ojdbc6.jar 파일이 없거나 연동되지 않았을때 예외발생
			System.out.println("오라클 드라이버 로딩 실패");
			e.printStackTrace();
		}
		catch(SQLException e) {
			//커넥션이나 URL이나 계정명이 잘못되었을때 예외 발생
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("알수 없는 예외발생");
		}
	}//end of InsertSQL
	
	//쿼리작성 및 실행 메소드
	private void execute() {
		try {
			//3.statement 객체 생성을 위한 메소드 호출
			stmt = con.createStatement();
			
			
			String test = "test4";
			//4.SQL문(쿼리문) 작성
			/*
			 		인파라미터 설정시 사용하는 메소드
			 		자료형이 
			 			숫자면 setInt()
			 			문자면 setString()
			 			날짜면 setDate()를 사용한다.
			 		해당 setXXX()메소드를 사용하면 '(싱글쿼테이션)은 자동으로 삽입된다.
			 */
			String sql = "INSERT INTO member VALUES "
					+ "  ('"+test+"', '4444', '오길동', SYSDATE) ";
			
			//5.쿼리실행 및 결과값 반환
			/*
			executeUpdate() : 쿼리문이 insert/update/delete와 같이
					기존레코드에 영향을 미치는 경우에 사용된다. 
					실행 후 영향을 받은 행의 갯수가 int형으로 반환된다.
			executeQuery() : select 쿼리를 실행할때 호출하는 메소드로
					레코드에 영향을 미치지 않고 조회만 하는 경우 사용된다.
					조회한 레코드를 반환값을 받아야 하므로 ResultSet객체를
					반환타입으로 사용하게 된다.
			*/
			int affected = stmt.executeUpdate(sql);
			System.out.println(affected + "행이 입력되었습니다.");
		}
		
		
		catch(SQLException e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		finally {
			close();
		}
	}//end of execute
	
	private void close() {
		try {
			if(stmt != null) stmt.close();
			if(con != null) con.close();
			System.out.println("DB자원반납완료");
		}
		catch(SQLException e) {
			System.out.println("자원반납시 오류가 발생하였습니다.");
		}
	}//end of close
	
	////////메인 메소드는 static이므로 method영역에 바로 올라가 클래스 안에 있는 것처럼 보이지만
	/////// method영역으로 들어가 있어 클래스를 호출할 수있다.
	public static void main(String[] args) {
		
		//실행방법 1 : 객체생성후 참조변수에 대입후 메소드 호출
//		InsertQuery iSQL = new InsertQuery();
//		iSQL.execute();
		
		//실행방법2 : 객체생성과 동시에 메소드 호출
		new InsertQuery().execute();
		
		
	}

}
