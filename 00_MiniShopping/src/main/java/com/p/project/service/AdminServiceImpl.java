package com.p.project.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.p.project.DAO.AdminDAO;
import com.p.project.DTO_VO.AdminDTO_VO;

@Service
public class AdminServiceImpl implements AdminService{

	@Inject
	AdminDAO adminDao;
	
	//관리자 로그인 체크. adminDao의 로그인 체크 메서드 호출
	@Override
	public String adminlogin(AdminDTO_VO admin_vo) {
		return adminDao.adminlogin(admin_vo);
	}

}
