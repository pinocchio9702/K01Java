package ex21jdbc.shopping;

import java.sql.SQLException;
import java.util.Scanner;

public class SelectShop extends ConnectDB{
	
	public SelectShop() {
		super();
	}

	@Override
	void execute() {
		try {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("상품명을 입력하세요");
			String name = scan.nextLine();
			
			
			stmt = con.createStatement();
			
			String query = "SELECT g_idx, goods_name, goods_price, to_char(regidate, 'yyyy-mm-dd hh24:mi'), p_code "
					+ "   from sh_goods  "
					+ "   WHERE goods_name like '%"+name+"%'";
			
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				String g_idx = rs.getString(1); //id컬럼
				String goods_name = rs.getString(2);
				String goods_price = rs.getString(3);
				String regidate = rs.getString(4);
				String p_code = rs.getString(5);
				
				/*
				오라클르이 date타입을 getDate()로 추출하면 0000-00-00
				형태로 출력된다. 이경우 date형 자료가 되기 때문에
				java.sql.Date클래스의 참조변수로 저장해야 된다. 
				 */
				
				
				System.out.printf("%-5s %-5s %-5s %-20s %-5s\n", 
						g_idx, goods_name, goods_price, regidate, p_code);
				

				
			}
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
		SelectShop selectshop = new SelectShop();
		selectshop.execute();
	}
	
}
