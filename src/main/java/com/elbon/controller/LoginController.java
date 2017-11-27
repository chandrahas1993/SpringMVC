package com.elbon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping(value = "/getMsg", method = RequestMethod.GET)
	public String index(ModelMap model) {
		model.addAttribute("message","Hello spring web mvc");
		return "login";
	}
}
