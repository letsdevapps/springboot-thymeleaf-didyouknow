package com.pro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pro.model.Awards;
import com.pro.model.DidYouKnow;
import com.pro.repository.AwardsRepository;

@Service
public class AwardsService {

	@Autowired
	private AwardsRepository awardsDAO;

	public Optional<Awards> findById(Long id) {
		return awardsDAO.findById(id);
	}
	
	public Optional<Awards> pickRandom() {
		Long randomAward = (long) (1L + Math.random() * (8L - 1L));
		return awardsDAO.findById(randomAward);
	}

	public List<Awards> findAll() {
		return awardsDAO.findAll();
	}

	public Page<Awards> findAll(Pageable pageable) {
		return awardsDAO.findAll(pageable);
	}
}