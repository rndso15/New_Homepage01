package com.mypage.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypage.sample.dao.SampleDao;

@Service("sampleService")
public class SampleServiceImpl implements SampleService{

	@Autowired
	protected SampleDao	sampleDao;

	@Override
	public String selectSampleData() throws Exception {
		// TODO Auto-generated method stub
		return sampleDao.selectSampleData();
	}
	
	
}
