package servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/play")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Random rand = new Random();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer com = rand.nextInt(100);
		HttpSession session = request.getSession();
		session.setAttribute("com", com);
		String url = "WEB-INF/jsp/game.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer user = 0;
		String errMsg = "";
		try {
			user = Integer.parseInt(request.getParameter("user"));
		} catch (NumberFormatException e) {
			errMsg += "数字を入力してください";
		}
		if (errMsg.length() > 0) {
			request.setAttribute("errMsg", errMsg);
		} else {
			HttpSession session = request.getSession();
			Integer com = (Integer) session.getAttribute("com");
			System.out.println("com:" + com);
			String result = null;
			if (user.equals(com)) {
				result = "正解です";
				com = rand.nextInt(100);
				session.setAttribute("com", com);
			} else if (user > com) {
				result = "大きすぎます";
			} else {
				result = "小さすぎます";
			}
			request.setAttribute("result", result);
		}
		String url = "WEB-INF/jsp/game.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
