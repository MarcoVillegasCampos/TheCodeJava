package com.codingdojo.MainApp;

import javax.servlet.http.HttpSession;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@SpringBootApplication
@Controller
public class TheCodeApplication {
	
	private static Code systemCode= new Code();
	

	public static void main(String[] args) {
		SpringApplication.run(TheCodeApplication.class, args);
		
		
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login() {
		
		return "index.jsp";
	}

	@RequestMapping(value = "/validateCode", method = RequestMethod.GET)
	public String validateUser(@RequestParam(value ="code") String code, HttpSession session,
			RedirectAttributes redirectAttributes) {

		if (systemCode.getCode().equals(code)) {
			session.setAttribute("code", code);
			
			
			return "code.jsp";
		} else {

			redirectAttributes.addFlashAttribute("errorMessage", "You must train harder");
			return "redirect:/";
		}

	}
}
