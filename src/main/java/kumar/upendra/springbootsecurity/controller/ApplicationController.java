package kumar.upendra.springbootsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/security")
public class ApplicationController {
	
	
	@GetMapping("/message")
	public String getMeassage() {
		return "Spring Boot Security Example";
	}

}
