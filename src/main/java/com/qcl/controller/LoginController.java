package com.qcl.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sys")
public class LoginController {
	private static final Logger logger=Logger.getLogger(LoginController.class);
	
	@ResponseBody
	@RequestMapping("/login")
	public String login(String username,String password){
		
		logger.info("username="+username+"password="+password);
		
		
		
		return "";
	}
}
