package servlet;

import java.io.IOException;
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
		HttpSession session = request.getSession();
		String retry = request.getParameter("retry");
		if (retry == null) {
			int num = (int) (Math.random() * 99) + 1;
			Game game = new Game();
			game.setCom(num);
			session.setAttribute("game", game);
		}
		else if (retry.equals("new")) {
			int num = (int) (Math.random() * 99) + 1;
			Game game = (Game) session.getAttribute("game");
			game.setCom(num);
			// session.setAttribute()はいらない。参照だから。
		}
		String url = "WEB-INF/jsp/game.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = 0;
		String errMsg = "";
		try {
			num = Integer.parseInt(request.getParameter("num"));
		} catch (NumberFormatException e) {
			errMsg += "数字を入力してください";
		}
		String url = null;
		if (errMsg.length() == 0) {
			HttpSession session = request.getSession();
			Game game = (Game) session.getAttribute("game");
			// System.out.println("com:" + game.getCom());
			game.setUser(num);
			SetResultLogic logic = new SetResultLogic();
			logic.execute(game);
			// session.setAttribute("game", game); // 参照なので、必要ない。
			url = "WEB-INF/jsp/gameResult.jsp";
		} else {
			request.setAttribute("errMsg", errMsg);
			url = "WEB-INF/jsp/game.jsp";
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}