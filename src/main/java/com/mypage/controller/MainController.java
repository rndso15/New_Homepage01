package com.mypage.controller;

import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mypage.sample.service.SampleService;

@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Resource(name = "sampleService")
	private SampleService sampleService;
	
	// 정상코드
//	@RequestMapping("index.do")
//	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//	
//		return "index";
//	}
	
	
	// 수정 , 실험 중인 메소드 구간 === === === ===
	@RequestMapping("index.do")
	public ModelAndView indexview(ModelAndView mv) throws Exception {
		
		// View 페이지 이름을 넣음.
		mv.setViewName("index");
		
		// View안에 가져가는 오브젝트를 포함시킴.
		mv.addObject("sampleAttribute" , "123");
		
		return mv;
	}
	// 수정 , 실험 중인 메소드 구간 === === === ===
	
	
	
	
//	@RequestMapping("home.do")
//	public String index(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		return "home";
//	}
	
	
	// 수정 , 실험 중인 메소드 구간 === === === ===
		@RequestMapping("home.do")
		public ModelAndView homeview(ModelAndView mv) throws Exception {
			
			// 문제 있는 부분 
			
			mv.setViewName("home");
			mv.addObject("sampleAttribute" , sampleService.selectSampleData());
			
			return mv;
		}
		// 수정 , 실험 중인 메소드 구간 === === === ===
	
	@RequestMapping("projects.do")
	public String projects(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		return "projects";
	}
	
}
