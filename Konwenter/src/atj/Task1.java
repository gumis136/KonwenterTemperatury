package atj;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Task1
 */

@WebServlet(urlPatterns = { "/calculate" }, name = "Calculator")
public class Task1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Calculator calculator = new Calculator();
			Double first = null;
			first = Double.valueOf(request.getParameter("first"));
			String operation = request.getParameter("operation");
			Double result = calculator.doCF(operation, first);
			request.setAttribute("result", result);
			request.getRequestDispatcher("/result.jsp").forward(request, response);

		} catch (NumberFormatException e) {

			request.getRequestDispatcher("/result1.jsp").forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
