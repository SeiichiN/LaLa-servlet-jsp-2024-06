package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Janken;
import model.JudgeLogic;

@WebServlet("/janken")
public class JankenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "WEB-INF/jsp/index.jsp";
		RequestDispatcher d = request.getRequestDispatcher(url);
		d.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String errMsg = "";
		int hand = 3;
		try {
			hand = (Integer.parseInt(request.getParameter("hand")));
		} catch (NumberFormatException e) {
			errMsg += "選択してください";
		}
		String url = "";
		if (errMsg.length() == 0) {
			int com = (int)(Math.random() * 3);
			Janken janken = new Janken(hand, com);
			JudgeLogic logic = new JudgeLogic();
			logic.execute(janken);
			request.setAttribute("janken", janken);
			url = "WEB-INF/jsp/result.jsp";
		} else {
			request.setAttribute("errMsg", errMsg);
			url = "WEB-INF/jsp/index.jsp";
		}
		RequestDispatcher d = 
				request.getRequestDispatcher(url);
		d.forward(request, response);

	}

}
