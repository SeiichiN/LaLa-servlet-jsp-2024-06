package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/janken")
public class JankenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int hand = (Integer.parseInt(request.getParameter("hand")));
		int com = (int)(Math.random() * 3);
		String result = null;
		if (com == hand) {
			result = "引き分け";
		} else if ((hand + 1) % 3 == com) {
			result = "あなたの勝ち";
		} else {
			result = "わたしの勝ち";
		}
		String[] hands = {"グー", "チョキ", "パー"};
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<p>あなた:" + hands[hand] + " わたし:" + hands[com] + "</p>");
		out.println("<p>" + result + "</p>");
		out.println("<p><a href=\"/janken/\">もう一度する</a></p>");
		out.println("</body></html>");
	}

}
