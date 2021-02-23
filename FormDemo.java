
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormDemo
 */
@WebServlet("/FormDemo")
public class FormDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String username = request.getParameter("username");
		out.print("User Name : " + username + "<br>");

		String gender = request.getParameter("gender");
		out.print("Gender : " + gender + "<br>");

		out.print("The selected Courses are : <br>");

		String courses[] = request.getParameterValues("courses");// fetch all the values from HTML

		for (String values : courses) {
			out.print(values + "<br>");
		}
	}

}
