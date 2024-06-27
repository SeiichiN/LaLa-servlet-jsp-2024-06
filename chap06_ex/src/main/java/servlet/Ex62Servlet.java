package servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex62")
public class Ex62Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = new Random().nextInt(10);
		if (num % 2 == 0) {
			// 偶数
			System.out.println("偶数");
			RequestDispatcher d = 
					request.getRequestDispatcher
					  ("WEB-INF/jsp/forwarded.jsp");
			d.forward(request, response);
		} else {
			// 奇数
			System.out.println("奇数");
			response.sendRedirect("redirected.jsp");
		}
	}

}
