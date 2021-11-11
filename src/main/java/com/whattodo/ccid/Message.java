package com.whattodo.ccid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/v1")
public class Message {
	
	@GetMapping("/welcome/{name}")
	public String welcome(@PathVariable String name) {
		return "Hi " + name + " welcome!!!";
	}

}
