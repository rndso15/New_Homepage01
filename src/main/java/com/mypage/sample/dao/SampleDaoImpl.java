package com.mypage.sample.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// 2. dao 인터페이스 에서 정의한 걸 참조
// sqlsession 하나와 정보를 가져오는 session 하나.
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
