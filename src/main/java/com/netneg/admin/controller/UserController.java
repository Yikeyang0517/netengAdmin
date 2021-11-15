package com.netneg.admin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netneg.admin.vo.ResultJson;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

	@PostMapping("login")
	public ResultJson userLogin(HttpServletRequest req ) {
		String str = "12345678";
		/* ResultJson ret = ResultJson.success(str); */
//		filter
		/* System.out.println("打印SessionId: "+req.getSession().getId()); */
		return null;
	}
	
	
}
