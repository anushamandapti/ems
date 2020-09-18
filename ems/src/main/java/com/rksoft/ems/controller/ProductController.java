package com.rksoft.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	
	@GetMapping("/")
	public ModelAndView product() {
		System.out.println("ProductController.product()");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("KEY", "flipkart");
		mv.addObject("RK", "anu");
		mv.setViewName("index");
		
		return mv;
	}
	

}
