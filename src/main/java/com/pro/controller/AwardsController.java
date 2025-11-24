package com.pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pro.service.AwardsService;

@Controller
@RequestMapping("/awards")
public class AwardsController {

	@Autowired
	private AwardsService awardsService;

	@GetMapping({ "", "/" })
	public String index(Model model) {
		model.addAttribute("awardsList", awardsService.findAll());
		return "web/awards/index";
	}
}