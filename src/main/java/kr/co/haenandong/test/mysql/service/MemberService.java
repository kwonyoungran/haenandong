/**
 * 
 */
/**
 * @author horan
 *
 */
package kr.co.haenandong.test.mysql.service;

import java.util.List;

import kr.co.haenandong.test.mysql.dto.MemberVO;

public interface MemberService {
	public List<MemberVO> selectMember() throws Exception;
}