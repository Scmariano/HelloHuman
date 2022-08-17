package com.stephen.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloHumanController {

	@RequestMapping("")
	public String name(@RequestParam(value="name", required = false) String name,
			@RequestParam(value="last_name", required = false) String last_name,
			@RequestParam(value="times", required = false) Integer times) {
		if(times != null && times > 0) {
			String result= "";
			for (int i=0; i<times; i++) {
				if(name != null && last_name != null) {
					result += "Hello" + name + " " + last_name;
				}
				else if (name != null) {
					result += "Hello" + name;
				}
				else if(last_name != null) {
					result += "Hello" + last_name;
				}else {
					result += "Hello Human";
				}
			}
			return result;
		}
		
		if(name != null && last_name != null) {
			return "Hello " + name + " " + last_name;
		}else if(name != null) {
			return "Hello " + name;
		}else if(last_name != null) {
			return "Hello " + last_name;
		}
		return "Hello Human";
		 
	}
	
	
}
