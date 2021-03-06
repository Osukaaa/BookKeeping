package servret;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookKeepingDao;

/**
 * Servlet implementation class Income_Insert
 */
@WebServlet("/Income_Insert")
public class Income_Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Income_Insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		StringBuilder date = new StringBuilder();
		date.append(request.getParameter("year"));
		date.append(request.getParameter("month"));
		date.append(request.getParameter("date"));

		BookKeepingDao.insertIncome_spending(1, date.toString() , Integer.parseInt(request.getParameter("type")), Integer.parseInt(request.getParameter("money")));

		String view = "/WEB-INF/view/Income_Insert.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

}
