package com.pro.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.model.DidYouKnow;
import com.pro.service.DidYouKnowService;

@RestController
@RequestMapping("/api/didyouknow")
public class DidYouKnowApi {

	@Autowired
	private DidYouKnowService didYouKnowService;

	@GetMapping({ "", "/" })
	public ResponseEntity<String> index() {
		String m = "Did-You-Know esta acessivel!";
		return ResponseEntity.ok(m);
	}

	@GetMapping("/all")
	public ResponseEntity<List<DidYouKnow>> findAll() {
		return ResponseEntity.ok(didYouKnowService.findAll());
	}

	@GetMapping("/random")
	public ResponseEntity<Optional<DidYouKnow>> pickRandom() {
		return ResponseEntity.ok(didYouKnowService.pickRandom());
	}
}