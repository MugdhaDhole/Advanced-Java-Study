
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Names
 */
@WebServlet("/Names")
public class Names extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Enumeration en = request.getParameterNames();// fetch all the names from HTML
		while (en.hasMoreElements()) {
			String name = (String) en.nextElement();
			String value = request.getParameter(name);
			out.print("The name is " + name + " and value is " + value + "<br>");
		}
	}

}
