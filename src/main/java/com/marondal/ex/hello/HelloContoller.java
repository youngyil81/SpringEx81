package com.marondal.ex.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloContoller {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String helloWorld () {
		return "Hello World";

	}

}
