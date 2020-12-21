package ex21jdbc.callable;

import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;

public class DeleteProcCall extends IConnectImpl{
	public DeleteProcCall() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			csmt = con.prepareCall("{call KosmoMemberDelete(?,?)}");
			//in파라미터 설정
			csmt.setString(1, scanValue("삭제할 아이디"));
			//out파라미터 설정 반환값의 자료형을 설정함.
			csmt.registerOutParameter(2, Types.VARCHAR);
			//실행
			csmt.execute();
			
			System.out.println("삭제프로시저 실행결과 :");
			System.out.println(csmt.getString(2));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		new DeleteProcCall().execute();
	}
}
