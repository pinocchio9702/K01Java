package ex21jdbc.shopping;

import java.sql.Types;

import ex21jdbc.callable.DeleteProcCall;
import ex21jdbc.connect.IConnectImpl;

public class UpdateShop extends IConnectImpl{
	public UpdateShop() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			csmt = con.prepareCall("{call ShopUpdateGoods(?,?,?,?,?)}");
			
			csmt.setString(4, scanValue("변경할 제품코드"));
			csmt.setString(1, scanValue("변경할 이름"));
			csmt.setString(2, scanValue("변경할 가격"));
			csmt.setString(3, scanValue("변경할 상품코드"));
			csmt.registerOutParameter(5, Types.NUMERIC);
			
			csmt.execute();
			
			System.out.println("수정프로시저 실행결과 :");
			System.out.println(csmt.getString(5));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		new UpdateShop().execute();
	}
}
