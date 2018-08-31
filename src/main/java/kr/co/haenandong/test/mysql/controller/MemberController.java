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

import kr.co.haenandong.test.mysql.dto.MemberVO;
import kr.co.haenandong.test.mysql.service.MemberService;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Inject
	private MemberService service;

	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String member(Model model) throws Exception {
		logger.info("home");

		List<MemberVO> memberList = service.selectMember();

		model.addAttribute("memberList", memberList);

		return "home";
	}

}
