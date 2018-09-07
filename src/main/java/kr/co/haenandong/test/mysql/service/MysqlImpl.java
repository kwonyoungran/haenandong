package kr.co.haenandong.test.mysql.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.haenandong.test.mysql.dao.MysqlDAO;
import kr.co.haenandong.test.mysql.dto.MysqlVO;

@Service
public class MysqlImpl implements MysqlService {

	@Inject
	private MysqlDAO dao;
	
	@Override
	public List<MysqlVO> selectMember() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectMember();
	}

}
