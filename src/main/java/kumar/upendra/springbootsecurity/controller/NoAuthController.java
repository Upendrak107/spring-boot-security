package kumar.upendra.springbootsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noauth/rest")
public class NoAuthController {
	
	@GetMapping("/hello")
	public String greetingMessage() {
		return "no suthorization";
	}

}
