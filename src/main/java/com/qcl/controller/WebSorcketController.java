package com.qcl.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qcl.entity.User;
import com.qcl.service.api.UserService;

@Controller
@RequestMapping("/web")
public class WebSorcketController {
	
	private static Logger logger=Logger.getLogger(WebSorcketController.class);
	
	@Autowired
	private UserService userService;

	@ResponseBody
	@RequestMapping("/send")
	public String sendMessage() {
	
		System.out.println("come in ");
		
		List<User> user=userService.getUser();
		logger.info("user="+user.size());
		logger.info("============================");
		//System.out.println("size=="+user.size());
		//System.out.println("user=="+user.get(0).toString());
		return "seccess";
	}
}
