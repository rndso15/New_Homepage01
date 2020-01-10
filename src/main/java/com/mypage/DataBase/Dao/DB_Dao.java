package com.mypage.DataBase.Dao;

import java.util.List;

import com.mypage.bean.Site_Member;

// 1. Dao 객체 
// 데이터에 접근하는 객체 

// 요약 : DB 에서 데이터 담는 그릇.
public interface DB_Dao {

	public String selectData() throws Exception;
	public List<Site_Member> selectALLData() throws Exception;
}
