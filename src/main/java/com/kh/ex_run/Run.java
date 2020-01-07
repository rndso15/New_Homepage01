package com.kh.ex_run;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kh.ex.MyCalculator;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String configLoc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		
		MyCalculator Mycal = ctx.getBean("mycalculator" , MyCalculator.class);
		Mycal.add();
	}

}
