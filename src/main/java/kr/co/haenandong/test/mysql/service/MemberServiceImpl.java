package kr.co.haenandong.test.mysql.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.haenandong.test.mysql.dao.MemberDAO;
import kr.co.haenandong.test.mysql.dto.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAO dao;
	
	@Override
	public List<MemberVO> selectMember() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectMember();
	}

}
