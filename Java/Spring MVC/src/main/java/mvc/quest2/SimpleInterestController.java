package mvc.quest2;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController {
	
	@RequestMapping(value="/interest")
	public ModelAndView getInput() {
		return new ModelAndView("Quest2/InterestForm");
	}
	
	@RequestMapping(value="/interestResult", method=RequestMethod.POST)
	public ModelAndView calculate(@RequestParam Map<String, String> req) {
		float p= Float.parseFloat(req.get("principal"));
		int t= Integer.parseInt(req.get("time"));
		int r= Integer.parseInt(req.get("rate"));
		float si=(p*t*r)/100;
		ModelAndView mav= new ModelAndView("Quest2/Result");
		mav.addObject("msg", si);
		return mav;
	}
}
