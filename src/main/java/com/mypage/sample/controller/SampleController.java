package com.mypage.sample.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mypage.sample.service.SampleService;

@Controller
public class SampleController {
	
	@Resource(name = "sampleService")
	private SampleService sampleService;
	
	@RequestMapping("/sample.bgn")
	public String sampleView() throws Exception {
		System.out.println(sampleService.selectSampleData());
		return "sample";
	}
	
}
