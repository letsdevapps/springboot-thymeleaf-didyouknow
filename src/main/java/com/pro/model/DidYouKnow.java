package com.pro.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_didyouknow")
@SequenceGenerator(name = "rad_didyouknow_seq", sequenceName = "rad_didyouknow_id_seq", allocationSize = 1, initialValue = 1)
@Data
public class DidYouKnow implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "didyouknow_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rad_didyouknow_seq")
	private Long id;

	@Column(name = "title", length = 500)
	private String title;

	@Column(name = "text", length = 500)
	private String text;

	@Column(name = "text_html", length = 1000)
	private String textHtml;
}