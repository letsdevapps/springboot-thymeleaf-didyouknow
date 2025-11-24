package com.pro.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pro.model.Awards;
import com.pro.model.DidYouKnow;
import com.pro.service.AwardsService;
import com.pro.service.DidYouKnowService;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	private DidYouKnowService didYouKnowService;

	@Autowired
	private AwardsService awardsService;

	@GetMapping({ "", "/" })
	public String index(Model model) {
		model.addAttribute("message", "Bem-vindo à página Você-Sabia!");
		
		Optional<DidYouKnow> didyouknow = didYouKnowService.pickRandom();
		model.addAttribute("didyouknow", didyouknow.get());
		
		Optional<Awards> award = awardsService.pickRandom();
		model.addAttribute("awards", award.get());
		return "home/home";
	}
}