package com.pro.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.model.Awards;
import com.pro.service.AwardsService;

@RestController
@RequestMapping("/api/awards")
public class AwardsApi {

	@Autowired
	private AwardsService awardsService;

	@GetMapping({ "", "/" })
	public ResponseEntity<String> index() {
		String m = "Awards esta acessivel!";
		return ResponseEntity.ok(m);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Awards>> findAll() {
		return ResponseEntity.ok(awardsService.findAll());
	}
}