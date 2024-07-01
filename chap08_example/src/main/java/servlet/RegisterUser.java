package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.RegisterUserLogic;
import model.User;

@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardPath = null;
		String action = request.getParameter("action");
		if (action == null) {  // 最初のとき
			forwardPath = "WEB-INF/jsp/registerForm.jsp";
		} 
		else if (action.equals("done")) { // ?action=done
			// 登録処理
			HttpSession session = request.getSession();
			User registerUser = 
					(User) session.getAttribute("registerUser");
			RegisterUserLogic logic = new RegisterUserLogic();
			logic.execute(registerUser); // 登録できた
			session.removeAttribute("registerUser");
			forwardPath = "WEB-INF/jsp/registerDone.jsp";
		}
		request.getRequestDispatcher(forwardPath).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		User registerUser = new User(id, name, pass);
		HttpSession session = request.getSession();
		session.setAttribute("registerUser", registerUser);
		
		String url = "WEB-INF/jsp/registerConfirm.jsp";
		request.getRequestDispatcher(url).forward(request, response);
		
	}	

}
