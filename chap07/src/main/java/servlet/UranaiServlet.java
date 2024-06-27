package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Uranai;

@WebServlet("/UranaiServlet")
public class UranaiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] luckArray = {"超スッキリ", "まあまあスッキリ", "サイテー"};
		int index = (int)(Math.random() * 3);
		String luck = luckArray[index];
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
		String today = sdf.format(date);
		
		// Uranaiインスタンスを作成
		Uranai uranai = new Uranai(luck, today);
		// Uranaiインスタンスをスコープに保存
		request.setAttribute("uranai", uranai);
		// jspにフォワード
		RequestDispatcher d = request.getRequestDispatcher
		  ("WEB-INF/jsp/uranai.jsp");
		d.forward(request, response);
	}

}
