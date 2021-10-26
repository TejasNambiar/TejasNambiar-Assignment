package mvc.quest9;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mvc.quest10.Employee;

@Controller
public class EmployeeController9 {
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
	
	@RequestMapping(value="/view-employees")
	public ModelAndView home() {
		return new ModelAndView("Quest9/Home");
	}
	
	@RequestMapping(value = "/view/{offset}")
    public ModelAndView view(@PathVariable("offset")Integer offset){
        ModelAndView mv=new ModelAndView("Quest9/Employees");
        if(offset*5>list.size())
        	mv.addObject("list",list.subList((offset-1)*5,list.size()));
        else
        	mv.addObject("list",list.subList((offset-1)*5,offset*5));
        mv.addObject("length",((list.size())/5)+1);
        return mv;

    }
}
