package com.wolf.dn2.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wolf.dn2.config.RunTimeInfo;

@Controller
public class PageController {
	
	@RequestMapping("/indexTest")
	public ModelAndView indexTest(String userName) {
		ModelAndView mv = new ModelAndView("/indexTest");
		mv.addObject("name", userName);
		
		return mv;
		
	}
	
	@RequestMapping("/index")
	public ModelAndView index(String userName) {
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("name", userName);
		System.out.println(RunTimeInfo.EXCUTE_PATH);
		return mv;
		
	}
}
