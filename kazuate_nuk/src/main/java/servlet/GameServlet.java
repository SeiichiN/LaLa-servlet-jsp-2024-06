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
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer com = new Random().nextInt(99) + 1;
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
		HttpSession session = request.getSession();
		Integer com = (Integer) session.getAttribute("com");
		String result = null;
		if (user == com) {
			result = "正解です";
		} else if (user > com) {
			result = "大きすぎます";
		} else if (user < com && user > 0){
			result = "小さすぎます";
		}
		if (errMsg.length() > 0) {
			request.setAttribute("errMsg", errMsg);
		}
		request.setAttribute("result", result);
		String url = "WEB-INF/jsp/game.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
