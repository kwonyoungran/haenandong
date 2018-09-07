/**
 * 
 */
/**
 * @author horan
 *
 */
package kr.co.haenandong.test.mysql.dao;

import java.util.List;

import kr.co.haenandong.test.mysql.dto.MysqlVO;

public interface MysqlDAO {
	public List<MysqlVO> selectMember() throws Exception;
}