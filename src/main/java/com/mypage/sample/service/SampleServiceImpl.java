package com.mypage.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypage.sample.dao.SampleDao;

// 1. Dao 를 통해 가져온 정보를 꺼내서 가공하는 서비스를 제공

@Service("sampleService")
public class SampleServiceImpl implements SampleService{

	@Autowired
	protected SampleDao	sampleDao;

	@Override
	public String selectSampleData() throws Exception {
		// TODO Auto-generated method stub
		
		String serviceTest = "서비스로 가공됨 : " + sampleDao.selectSampleData();
		
		return serviceTest;
	}
	
	
}
