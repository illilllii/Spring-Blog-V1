package com.cos.blog.web;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.blog.config.auth.PrincipalDetails;

@Controller
public class UserController {

	// 로그인, 로그아웃, 회원가입, 회원정보 변경 (AuthController)
	
	// /user/1 -> 유저 정보가져오기
	
	//@AuthenticationPrincipal PrincipalDetails principalDetails -> 세션확인
	@GetMapping("/user")
	public @ResponseBody String findAll(@AuthenticationPrincipal PrincipalDetails principalDetails) { // @Controller + @ResponseBody = @RestController
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		PrincipalDetails principalDetails = (PrincipalDetails)authentication.getPrincipal();
		System.out.println(principalDetails.getUsername());
		return "User";
	}

}
