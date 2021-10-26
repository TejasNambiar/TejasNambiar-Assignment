package mvc.quest11;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController11 {
	List<Employee> list= Arrays.asList(
			new Employee(1,"a",2346L),
			new Employee(2,"b",8586L),
			new Employee(3,"c",4524L),
			new Employee(4,"d",5533L),
			new Employee(5,"e",3468L),
			new Employee(6,"f",8865L),
			new Employee(7,"g",8767L),
			new Employee(8,"h",4564L),
			new Employee(9,"i",9154L),
			new Employee(10,"j",2685L),
			new Employee(11,"k",5456L),
			new Employee(12,"l",5656L),
			new Employee(13,"m",3445L)
			);

	@RequestMapping(value="/report/pdf", method=RequestMethod.GET)
	public ModelAndView employeePdf(HttpServletRequest req, HttpServletResponse res) {
		
		String type= req.getParameter("type");
		
		if(type!=null && type.equals("pdf"))
			return new ModelAndView(new PdfView(), "employeeList", list);
		
		return new ModelAndView("Quest11/EmployeeListReport", "employeeList", list);
	}
}
