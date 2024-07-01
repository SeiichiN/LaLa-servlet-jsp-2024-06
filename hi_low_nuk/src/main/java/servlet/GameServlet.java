package servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Game;
import model.SetResultLogic;

@WebServlet("/play")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int com = new Random().nextInt(99) + 1;
		Game game = new Game();
		game.setCom(com);
		HttpSession session = request.getSession();
		session.setAttribute("game", game);
		String url = "WEB-INF/jsp/game.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int user = Integer.parseInt(request.getParameter("user"));
		HttpSession session = request.getSession();
		Game game = (Game) session.getAttribute("game");
		game.setUser(user);
		SetResultLogic logic = new SetResultLogic();
		logic.execute(game);
		String url = "WEB-INF/jsp/game.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
