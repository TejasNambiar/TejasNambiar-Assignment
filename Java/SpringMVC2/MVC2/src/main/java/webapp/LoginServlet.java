package webapp;

import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*
 * Browser sends Http Request to Web Server
 * 
 * Code in Web Server => Input:HttpRequest, Output: HttpResponse
 * JEE with Servlets
 * 
 * Web Server responds with Http Response
 */

//Java Platform, Enterprise Edition (Java EE) JEE6

//Servlet is a Java programming language class 
//used to extend the capabilities of servers 
//that host applications accessed by means of 
//a request-response programming model.

//1. extends javax.servlet.http.HttpServlet
//2. @WebServlet(urlPatterns = "/login.do")
//3. doGet(HttpServletRequest request, HttpServletResponse response)
//4. How is the response created?

public class LoginServlet extends HttpServlet {

	@WebServlet(urlPatterns = "/interest")
	public ModelAndView getInput() {
		return new ModelAndView("Quest2/InterestForm");
	}

	@RequestMapping(value = "/interestResult", method = RequestMethod.POST)
	public ModelAndView calculate(@RequestParam Map<String, String> req) {
		float p = Float.parseFloat(req.get("principal"));
		int t = Integer.parseInt(req.get("time"));
		int r = Integer.parseInt(req.get("rate"));
		float si = (p * t * r) / 100;
		ModelAndView mav = new ModelAndView("Quest2/Result");
		mav.addObject("msg", si);
		return mav;
	}

}