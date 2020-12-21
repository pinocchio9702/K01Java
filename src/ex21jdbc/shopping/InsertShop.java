package ex21jdbc.shopping;

import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;

public class InsertShop extends IConnectImpl{
	public InsertShop() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			/*
			프로시저는 return 값이 없으므로 함수처럼 ?= 로 시작하지 않느다.
			out파라미터를 통해 값을 반환하게 된다.
			 */
			csmt = con.prepareCall("{call Sh_GoodInsert(goods_seq.NEXTVAL,?,?,sysdate,?,?)}");
			//in파라미터 설정
			csmt.setString(1, scanValue("상품명"));
			csmt.setString(2, scanValue("상품가격"));
			csmt.setString(3, scanValue("상품코드"));
			//out파라미터 설정 반환값의 자료형을 설정함.
			csmt.registerOutParameter(4, Types.NUMERIC);
			//실행
			csmt.execute();
			int affected = csmt.getInt(4);
			
			if(affected ==0) {
				System.out.println("오류발생 : 입력실패");
			}
			else {
				System.out.println(affected + "행 입력 성공");
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
		new InsertShop().execute();
	}
	
}
