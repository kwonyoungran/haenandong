package kr.co.haenandong.test.mysql.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.haenandong.test.mysql.dto.MysqlVO;

@Repository
public class MysqlDAOImpl implements MysqlDAO {

	@Inject
	private SqlSession sqlSession;

	private static final String Namespace = "memberMapper";

	@Override
	public List<MysqlVO> selectMember() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(Namespace + ".selectMember");
	}

}
