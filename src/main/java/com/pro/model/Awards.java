package com.pro.model;

import java.io.Serializable;

import com.pro.en.AwardsNobel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_awards")
@SequenceGenerator(name = "rad_awards_seq", sequenceName = "rad_awards_id_seq", allocationSize = 1, initialValue = 1)
@Data
public class Awards implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "award_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rad_awards_seq")
	private Long id;

	@Column(name = "award_year")
	private Integer year;

	@Column(name = "category")
	@Enumerated(EnumType.STRING)
	private AwardsNobel category;

	@Column(name = "author")
	private String author;

	@Column(name = "title")
	private String title;

	@Column(name = "text")
	private String text;

	@Column(name = "text_html")
	private String textHtml;
}