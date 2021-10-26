package mvc.quest7;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController7 {
	
	@RequestMapping(value="/customer/Register")
	public ModelAndView register() {
		return new ModelAndView("Quest7/Registration");
	}
	
	@RequestMapping(value="/submit/Registration", method=RequestMethod.POST)
	public ModelAndView validate(@ModelAttribute("cus1") @Valid Customer cus, BindingResult result) {
		System.out.println(cus);
		if(result.hasErrors()) {
			ModelAndView mav=new ModelAndView("Quest7/Registration");
			return mav;
		}
		else
			return new ModelAndView("Quest7/Success");
	}
}
