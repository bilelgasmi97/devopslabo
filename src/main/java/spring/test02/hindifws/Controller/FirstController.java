package spring.test02.hindifws.Controller;

import org.springframework.web.bind.annotation.GetMapping;


public class FirstController {
	
	@GetMapping("/first")
	public String SayHello(){
		return "Hello World";
	}

}
