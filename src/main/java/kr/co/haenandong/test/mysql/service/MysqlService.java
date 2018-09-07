/**
 * 
 */
/**
 * @author horan
 *
 */
package kr.co.haenandong.test.mysql.service;

import java.util.List;

import kr.co.haenandong.test.mysql.dto.MysqlVO;

public interface MysqlService {
	public List<MysqlVO> selectMember() throws Exception;
}