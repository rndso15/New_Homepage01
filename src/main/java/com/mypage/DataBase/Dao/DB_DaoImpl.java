package com.mypage.DataBase.Dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mypage.bean.Site_Member;

// 2. dao 인터페이스 에서 정의한 걸 참조
// sqlsession 하나와 정보를 가져오는 session 하나.
@Repository("DB_Dao")
public class DB_DaoImpl implements DB_Dao {
	
	@Autowired
	protected SqlSessionTemplate sqlsession;

	@Override
	public String selectData() throws Exception {
		// TODO Auto-generated method stub
		return sqlsession.selectOne("sql.selectDisposableTable");
	}
	
	@Override
	public List<Site_Member> selectALLData() throws Exception {
		// TODO Auto-generated method stub

		return sqlsession.selectList("sql.selectlistTable");
	}
	

}
