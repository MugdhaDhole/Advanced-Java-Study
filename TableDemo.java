
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TableDemo
 */
@WebServlet("/TableDemo")
public class TableDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int result = 0;
		int tablename = Integer.parseInt(request.getParameter("tablename"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		for (int i = 1; i <= limit; i++) {
			result = i * tablename;
			out.print(tablename + "*" + i + "=" + result);
			out.print("<br>");
		}
	}

}
