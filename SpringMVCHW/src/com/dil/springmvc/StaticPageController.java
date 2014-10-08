package com.dil.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StaticPageController {
	@RequestMapping(value = "/myStaticPage", method = RequestMethod.GET)
	public String redirect() {

		return "redirect:/pages/staticPage.htm";
	}
}
