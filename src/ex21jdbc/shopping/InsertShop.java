package ex21jdbc.shopping;

import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;

public class InsertShop extends IConnectImpl{
	public InsertShop() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		int affected = 0;
		
		try {
			String sql = "INSERT INTO sh_goods "
					+ "  VALUES ( "
					+ "  goods_seq.nextval,?,?, sysdate,?)";
			psmt = con.prepareStatement(sql);
			psmt.setNString(1, scanValue("상품이름"));
			psmt.setNString(2, scanValue("상품가격"));
			psmt.setNString(3, scanValue("상품코드"));
			affected = psmt.executeUpdate();
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
