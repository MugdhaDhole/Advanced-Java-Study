
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculation
 */
@WebServlet("/Calculation")
public class Calculation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String number1 = request.getParameter("num1");
		String number2 = request.getParameter("num2");

		String calculation = request.getParameter("calc");
		System.out.println("You have clicked the " + calculation + " button");

		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);

		// int num=Integer.parseInt(request.getParameter("num1"));

		int result = 0;
		if (calculation.equalsIgnoreCase("add")) {
			result = n1 + n2;
			out.print("Addition : " + result);
		} else if (calculation.equalsIgnoreCase("sub")) {
			result = n1 - n2;
			out.print("Substraction : " + result);
		} else if (calculation.equalsIgnoreCase("mul")) {
			result = n1 * n2;
			out.print("Multiplication : " + result);
		} else if (calculation.equalsIgnoreCase("div")) {
			result = n1 / n2;
			out.print("Division : " + result);
		}
	}

}
