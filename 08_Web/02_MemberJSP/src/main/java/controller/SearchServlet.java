package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.Member;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import dao.MemberDAO;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
	 {
		
		

		try {
			String id =request.getParameter("id");
			// 2. 디비에서 정보 조회
			MemberDAO dao = new MemberDAO();
			Member member = dao.search(id);

			// 3. 바인딩
			request.setAttribute("member", member);
			// 4. serch.jsp
			request.getRequestDispatcher("search.jsp").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	
	}
}
