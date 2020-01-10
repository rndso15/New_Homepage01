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
	
	// �����ڵ�
//	@RequestMapping("index.do")
//	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//	
//		return "index";
//	}
	
	
	// ���� , ���� ���� �޼ҵ� ���� === === === ===
	@RequestMapping("index.do")
	public ModelAndView indexview(ModelAndView mv) throws Exception {
		
		// View ������ �̸��� ����.
		mv.setViewName("index");
		
		// View�ȿ� �������� ������Ʈ�� ���Խ�Ŵ.
		mv.addObject("sampleAttribute" , "123");
		
		return mv;
	}
	// ���� , ���� ���� �޼ҵ� ���� === === === ===
	
	
	
	
//	@RequestMapping("home.do")
//	public String index(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		return "home";
//	}
	
	
	// ���� , ���� ���� �޼ҵ� ���� === === === ===
		@RequestMapping("home.do")
		public ModelAndView homeview(ModelAndView mv) throws Exception {
			
			// ���� �ִ� �κ� 
			
			mv.setViewName("home");
			mv.addObject("sampleAttribute" , sampleService.selectSampleData());
			
			return mv;
		}
		// ���� , ���� ���� �޼ҵ� ���� === === === ===
	
	@RequestMapping("projects.do")
	public String projects(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		return "projects";
	}
	
}
