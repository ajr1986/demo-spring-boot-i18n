package com.springboot.i18n.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocaleController {

	@GetMapping(value = "/locale")
	public String localeHandler(HttpServletRequest request) {

		String lastUrl = request.getHeader("referer");
		return "redirect:" + lastUrl;
	}
}
