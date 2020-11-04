package ex21jdbc.statement;

import java.sql.SQLException;

public class UpdateSQL extends ConnectDB{
	
	//생성자
	public UpdateSQL(String user, String pass) {
		//부모클래스의 인자생성자를 호출
		super(user, pass);
	}

	@Override
	void execute() {
		try {
			stmt = con.createStatement();
			
			String sql = "UPDATE member   "
					+ " SET  "
					+ "			pass='1111' ,					"
					+ "			name= '이순신',		"
					+ "			regidate = sysdate			"
					+ "   WHERE id='ko1'  ";
			
			System.out.println("sql=" + sql);
			
			int affected = stmt.executeUpdate(sql);
			System.out.println(affected + "행이 업데이트 됨");
					
		}catch(SQLException e) {
			//커넥션이나 URL이나 계정명이 잘못되었을때 예외 발생
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("알수 없는 예외발생");
		}
		finally {
			close();
		}
		
	}
	
	public static void main(String[] args) {
		new UpdateSQL("kosmo", "1234").execute();
	}

	

}
