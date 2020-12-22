package ex21jdbc.shopping;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;

public class SelectShopProced extends IConnectImpl{
	public SelectShopProced() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			csmt = con.prepareCall("{call Sh_Goodselect(?,?,?,?,?)}");
			
			csmt.setString(1, scanValue("상품명"));
			csmt.registerOutParameter(2, Types.NUMERIC);
			csmt.registerOutParameter(3, Types.VARCHAR);
			csmt.registerOutParameter(4, Types.VARCHAR);
			csmt.registerOutParameter(5, Types.NUMERIC);
			
			csmt.execute();
			
			
			int idx = csmt.getInt(2);
			String name = csmt.getNString(3);
			String price = csmt.getNString(4);
			int code = csmt.getInt(5);
			
			System.out.printf("%-5s %-5s %-5s %-5s\n", 
					idx, name, price, code);
		}
		catch(SQLException e) {
			System.out.println("쿼리오류 발생");
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		new SelectShopProced().execute();
	}
}
