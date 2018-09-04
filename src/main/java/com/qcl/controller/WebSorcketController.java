package com.qcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/web")
public class WebSorcketController {

	@ResponseBody
	@RequestMapping("/send")
	public String sendMessage() {
	
		System.out.println("come in ");
		
		
		return "seccess";
	}
}
