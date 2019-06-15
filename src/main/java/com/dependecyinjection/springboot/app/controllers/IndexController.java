package com.dependecyinjection.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dependecyinjection.springboot.app.models.service.MyService;

@Controller
public class IndexController {
	
	@Autowired
//	@Qualifier("SimpleService")
	private MyService myService;
	
	@GetMapping({"/", "/index", ""})
	public String index(Model model) {
		model.addAttribute("object", myService.operator());
		return "index";
	}
	
//	@Autowired
//	public void setMyService(MyService myService) {
//		this.myService = myService;
//	}
	
	/*
	 * De Igual manera, cuando hacemos la inyección de dependencia por constructor, esta se puede obviar quitando la anotación @Autowired
	 * ya que el constructor la inyecta por automático
	 */
	
//	@Autowired
//	public IndexController(MyService myService) {
//		this.myService = myService;
//	}
	
}
