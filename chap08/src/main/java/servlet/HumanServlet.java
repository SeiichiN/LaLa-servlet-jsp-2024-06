package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Human;

@WebServlet("/HumanServlet")
public class HumanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Human human = new Human();
		human.setName("湊 雄輔");
		human.setAge(23);

		HttpSession session = request.getSession();
		session.setAttribute("human", human);

		String url = "WEB-INF/jsp/human.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
