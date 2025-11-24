package com.pro.en;

import lombok.Getter;

public enum AwardsNobel {

	CHEMISTRY("Nobel Química"), ECONOMIC_SCIENCES("Nobel Ciências Econômicas"), LITERATURE("Nobel Literatura"),
	PEACE("Nobel Paz"), PHYSICS("Nobel Física"), PHYSIOLOGY_MEDICINE("Nobel Fisiologia ou Medicina");

	@Getter
	private final String description;

	AwardsNobel(String description) {
		this.description = description;
	}
}