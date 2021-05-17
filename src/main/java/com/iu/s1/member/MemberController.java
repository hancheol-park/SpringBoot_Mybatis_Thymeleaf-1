package com.iu.s1.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/member/**")
public class MemberController {
	@Autowired
	private MemberService memberService;

	@GetMapping("login")
	public String getLogin()throws Exception{
		return "member/memberLogin";
	}
	
	@GetMapping("join")
	public String setJoin()throws Exception{
		return "member/memberJoin";
	}
	@PostMapping("join")
	public String setJoin(MemberVO memberVO, MultipartFile avatar)throws Exception{
		int result = memberService.setJoin(memberVO, avatar);
		
		return "redirect:../";
	}
}
