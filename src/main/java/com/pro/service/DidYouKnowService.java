package com.pro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pro.model.DidYouKnow;
import com.pro.repository.DidYouKnowRepository;

@Service
public class DidYouKnowService {

	@Autowired
	private DidYouKnowRepository didYouKnowDAO;

	public Optional<DidYouKnow> findById(Long id) {
		return didYouKnowDAO.findById(id);
	}

	public Optional<DidYouKnow> pickRandom() {
		Long randomDidyouknow = (long) (1L + Math.random() * (35L - 1L));
		return didYouKnowDAO.findById(randomDidyouknow);
	}

	public List<DidYouKnow> findAll() {
		return didYouKnowDAO.findAll();
	}

	public Page<DidYouKnow> findAll(Pageable pageable) {
		return didYouKnowDAO.findAll(pageable);
	}
}