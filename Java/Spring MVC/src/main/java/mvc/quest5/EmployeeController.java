package mvc.quest5;
import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	Map<Integer, Employee> employees= new HashMap<Integer, Employee>();
	static int count=0;
	
	@RequestMapping(value="/home")
	public ModelAndView home() {
		return new ModelAndView("Quest5/Home");
	}
	
	@RequestMapping(value="/display")
	public ModelAndView home(@ModelAttribute("employees") Employee emp) {
		System.out.println(emp);
		if(emp.getId()==0)
			emp.setId(++count);
		System.out.println(emp);
		employees.put(emp.getId(), emp);
		ModelAndView mav= new ModelAndView("Quest5/Display");
		mav.addObject("list", employees.values());
		return mav;
	}
	
	@RequestMapping(value="/add")
	public ModelAndView add() {
		return new ModelAndView("Quest5/AddEmployee");
	}
	
	@RequestMapping(value="/edit/{id}")
	public ModelAndView edit(@PathVariable("id") int id) {
		
		ModelAndView mav= new ModelAndView("Quest5/Update");
		mav.addObject("employee", employees.get(id));
		return mav;
	}
	
	@RequestMapping(value="/delete/{id}")
	public ModelAndView delete(@PathVariable("id") int id) {
		employees.remove(id);
		ModelAndView mav= new ModelAndView("Quest5/Display");
		mav.addObject("list", employees.values());
		return mav;
	}
	 
}
