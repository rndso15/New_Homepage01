package com.mypage.DataBase.Dao;

import java.util.List;

import com.mypage.bean.Site_Member;

// 1. Dao ��ü 
// �����Ϳ� �����ϴ� ��ü 

// ��� : DB ���� ������ ��� �׸�.
public interface DB_Dao {

	public String selectData() throws Exception;
	public List<Site_Member> selectALLData() throws Exception;
}
