package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import config.ServerInfo;

public class DBConnectionTest4 {

	public static void main(String[] args) {
		
		// 1. 드라이버 로딩
		try {
			Properties p = new Properties();
			p.load(new FileInputStream("src/config/db.properties"));
			
			
			Class.forName(p.getProperty("driver"));
			System.out.println("드라이버 로딩..");
			
			// 2. 디비 연결
			Connection connect = DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"),p.getProperty("password"));
			System.out.println("데이터베이스 로딩...");
			
			
			// 3. PreparedStatement - DELETE (user_no)
			String query = "DELETE FROM user_info WHERE user_no = ?";
			PreparedStatement ps = connect.prepareStatement(query);
			
			ps.setInt(1, 4);
			
			// 4. 쿼리문 실행
			System.out.println(ps.executeUpdate() + "삭제 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
