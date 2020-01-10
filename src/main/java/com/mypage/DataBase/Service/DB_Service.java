package com.mypage.DataBase.Service;

import java.util.List;
import com.mypage.bean.Site_Member;

public interface DB_Service {

	public String selectData() throws Exception;
	public List<Site_Member> selectALLData() throws Exception;
}
