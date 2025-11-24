package com.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.model.Awards;

@Repository
public interface AwardsRepository extends JpaRepository<Awards, Long> {

}