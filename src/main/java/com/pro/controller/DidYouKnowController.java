package com.pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pro.service.DidYouKnowService;

@Controller
@RequestMapping("/didyouknow")
public class DidYouKnowController {

	@Autowired
	private DidYouKnowService didYouKnowService;

	@GetMapping({ "", "/" })
	public String index(Model model) {
		model.addAttribute("didyouknowList", didYouKnowService.findAll());
		return "web/didyouknow/index";
	}
}