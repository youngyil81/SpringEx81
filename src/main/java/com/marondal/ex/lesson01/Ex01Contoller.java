package com.marondal.ex.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson01/ex01")
public class Ex01Contoller {

	@RequestMapping("/1")
	@ResponseBody
	public String printfString() {
		return "예제 1번 문자열을 response 에 출력한다";
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public Map<String, Object> printMap(){
		Map<String, Object> map = new HashMap<>();
		
		// 과일 이름과 가격.
		map.put("apple", 1500);
		map.put("banana", 5000);
		map.put("orange", 1000);
		return map;
	}
	

	

}
