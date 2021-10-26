package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/")
public class SimpleInterestController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.getRequestDispatcher("/WEB-INF/views/simpleInterest.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("principal", request.getParameter("principal"));
		request.setAttribute("years", request.getParameter("years"));
		request.setAttribute("rate", request.getParameter("rate"));

		int principal = Integer.parseInt((String) request.getAttribute("principal"));
		System.out.println(principal);
		int years = Integer.parseInt((String) request.getAttribute("years"));
		System.out.println(years);
		int rate = Integer.parseInt((String) request.getAttribute("rate"));
		System.out.println(rate);
		float value = (float) (principal * rate * years / 100);
		System.out.println(value);
		request.setAttribute("value", value);

		request.getRequestDispatcher("/WEB-INF/views/result.jsp").forward(request, response);

	}

}