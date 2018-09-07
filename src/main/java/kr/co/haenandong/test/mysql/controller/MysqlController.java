/**
 * 
 */
/**
 * @author horan
 *
 */
package kr.co.haenandong.test.mysql.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.haenandong.test.mysql.dto.MysqlVO;
import kr.co.haenandong.test.mysql.service.MysqlService;

@Controller
public class MysqlController {
	private static final Logger logger = LoggerFactory.getLogger(MysqlController.class);

	@Inject
	private MysqlService service;

	@RequestMapping(value = "/mysqlTest", method = RequestMethod.GET)
	public String member(Model model) throws Exception {
		logger.info("home");

		List<MysqlVO> memberList = service.selectMember();

		model.addAttribute("memberList", memberList);

		return "home";
	}

}
