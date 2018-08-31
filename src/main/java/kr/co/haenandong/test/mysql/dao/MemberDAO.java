/**
 * 
 */
/**
 * @author horan
 *
 */
package kr.co.haenandong.test.mysql.dao;

import java.util.List;

import kr.co.haenandong.test.mysql.dto.MemberVO;

public interface MemberDAO {
	public List<MemberVO> selectMember() throws Exception;
}