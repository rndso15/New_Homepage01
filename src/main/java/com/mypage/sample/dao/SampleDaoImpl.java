package com.mypage.sample.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("sampleDao")
public class SampleDaoImpl implements SampleDao {
	
	@Autowired
	protected SqlSessionTemplate sqlsession;

	@Override
	public String selectSampleData() throws Exception {
		// TODO Auto-generated method stub
		return sqlsession.selectOne("sql.selectDisposableTable");
	}
	
		
}
