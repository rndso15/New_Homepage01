package com.mypage.DataBase.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypage.DataBase.Dao.DB_Dao;
import com.mypage.bean.Site_Member;


// 1. Dao �� ���� ������ ������ ������ �����ϴ� ���񽺸� ����

@Service("DB_Service")
public class DB_ServiceImpl implements DB_Service{

	@Autowired
	protected DB_Dao DB_Dao;

	@Override
	public String selectData() throws Exception {

		// ���� DB���� ���߰��� �������� ��� 
		// �������� ����.
		String serviceTest = "";
		
		serviceTest = DB_Dao.selectData();
		
		return serviceTest;
	}

	@Override
	public List<Site_Member> selectALLData() throws Exception {
		// TODO Auto-generated method stub
		
		List<Site_Member> list = DB_Dao.selectALLData();
		
		return list;
	}

	
	
}
