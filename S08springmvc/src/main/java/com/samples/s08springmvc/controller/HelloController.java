package com.samples.s08springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		
		
		modelAndView.addObject("id", 14582);
		modelAndView.addObject("name", "Saikumar");
		modelAndView.addObject("salary", 27000);
		
		
		return modelAndView;
	}
	
}