package com.ashokit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelComeController {
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {

		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "welwelcome to Ashokit");
		mav.setViewName("index");
		return mav;
	}

}
