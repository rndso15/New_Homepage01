package com.mypage.sample.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mypage.sample.service.SampleService;

@Controller
public class SampleController {
	
	@Resource(name = "sampleService")
	private SampleService sampleService;
	
	@RequestMapping("/home.do")
	public ModelAndView homeview(ModelAndView mv) throws Exception {
		
		mv.addObject("sampleAttribute" , sampleService.selectSampleData());
		mv.setViewName("home");
		
		return mv;
	}
	
}
