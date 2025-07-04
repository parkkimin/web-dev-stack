package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import config.ServerInfo;

public class DBConnectionTest3 {
	

	public static void main(String[] args) {

		// 1. 드라이버 로딩
		try {
			Class.forName(ServerInfo.DRIVER);
			System.out.println("로딩 중...");

			// 2. 디비 연결
			Connection connect = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
			System.out.println("데이터베이스 연결...");
			// 3. PreparedStatement - 쿼리 : UPDATE(user_no를 선택해서 email 수정)
			String query = "UPDATE user_info SET EMAIL = ? WHERE user_no = ?";
			PreparedStatement ps = connect.prepareStatement(query);
			// 4. 쿼리문 실행 - executeUpdate
			ps.setString(1, "1232134@naver.com");
			ps.setInt(2, 4);
			
			System.out.println(ps.executeUpdate() + "명 수정");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
