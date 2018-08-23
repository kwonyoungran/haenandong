package kr.co.haenandong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DBController {
	
	private static final Logger logger = LoggerFactory.getLogger(DBController.class);

	@RequestMapping(value = "/dbtest", method = RequestMethod.GET)
	public String dbtest(Model model) {
		
		logger.info("DBTest");
		
		model.addAttribute("serverTime", "dbTest");
		
		return "home";
	}
}
