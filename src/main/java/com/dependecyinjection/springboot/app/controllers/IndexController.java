package com.dependecyinjection.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dependecyinjection.springboot.app.models.service.MyService;

@Controller
public class IndexController {
	
	@Autowired
	private MyService myService;
	
	@GetMapping({"/", "index", ""})
	public String index(Model model) {
		model.addAttribute("object", myService.operator());
		return "index";
	}
}
