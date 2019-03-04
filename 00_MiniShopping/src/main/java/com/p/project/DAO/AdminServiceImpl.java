package com.p.project.DAO;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.p.project.DTO_VO.AdminDTO_VO;

@Repository
public class AdminServiceImpl implements AdminDAO{

	@Inject
	SqlSession sqlSession;
	
	//관리자 로그인 체크. 관리자 테이블을 select조회한 결과 리턴
	@Override
	public String adminlogin(AdminDTO_VO admin_vo) {
		return sqlSession.selectOne("admin.adminlogin", admin_vo);
	}

}
