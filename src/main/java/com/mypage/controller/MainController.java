package com.mypage.controller;

import java.util.List;
import java.util.Locale; 

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mypage.DataBase.Service.DB_Service;
import com.mypage.bean.Site_Member;

@Controller
public class MainController {

	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@Resource(name = "DB_Service")
	private DB_Service sampleService;

	@RequestMapping("index.do")
	public ModelAndView indexview(ModelAndView mv) throws Exception {
		logger.info("start start start  === start start start ");

		// View ������ �̸��� ����.
		mv.setViewName("index");

		// View�ȿ� �������� ������Ʈ�� ���Խ�Ŵ.
		mv.addObject("sampleAttribute", "123");

		return mv;
	}

	@RequestMapping("home.do")
	public ModelAndView homeview(ModelAndView mv) throws Exception {

		// View ������ �̸��� ����.
		mv.setViewName("home");

		// View�ȿ� �������� ������Ʈ�� ���Խ�Ŵ.
		mv.addObject("sampleAttribute", sampleService.selectData());
		
		List<Site_Member> list = sampleService.selectALLData();
		
		mv.addObject("sample2" , list);

		return mv;
	}

	@RequestMapping("projects.do")
	public String projects(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		return "projects";
	}

}
