package com.mypage.sample.dao;

// 1. Dao 객체 
// 데이터에 접근하는 객체 

// 요약 : DB 에서 데이터 담는 그릇.
public interface SampleDao {

	public String selectSampleData() throws Exception;
	
}
