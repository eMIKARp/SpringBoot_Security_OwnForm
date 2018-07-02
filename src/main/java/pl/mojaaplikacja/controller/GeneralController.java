package pl.mojaaplikacja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GeneralController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/secret")
	public String secret() {
		return "secret";
	}

	@RequestMapping("/loginForm")
	public String loginForm() {
		return "loginForm";
    }
}
