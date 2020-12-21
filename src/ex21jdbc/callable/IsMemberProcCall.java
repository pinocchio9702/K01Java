package ex21jdbc.callable;

import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;

public class IsMemberProcCall extends IConnectImpl{
	public IsMemberProcCall() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			csmt = con.prepareCall("{call KosmoMemberAuth(?,?,?)}");
			//in파라미터 설정
			csmt.setString(1, scanValue("회원아이디"));
			csmt.setString(2, scanValue("회원패스워드"));
			//out파라미터 설정 반환값의 자료형을 설정함.
			csmt.registerOutParameter(3, Types.NUMERIC);
			//실행
			csmt.execute();
			
			int outParamResult = csmt.getInt(3);
			switch(outParamResult) {
			case 0:
				System.out.println("회원 아이디가 없어요. 회원가입해주세요");
				break;
			case 1:
				System.out.println("패스워드가 일치하지 않아요 비밀번호를 찾아주세요");
				break;
			case 2:
				System.out.println("로그인 성공");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		IsMemberProcCall mapc = new IsMemberProcCall();
		mapc.execute();
		
	}
}
