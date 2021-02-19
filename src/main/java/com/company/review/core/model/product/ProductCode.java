package com.company.review.core.model.product;

import java.util.stream.Stream;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ProductCode {

	PRODUCT1(0),
	PRODUCT2(1);

	private final int value;

	ProductCode(int value) {
		this.value = value;
	}

	@JsonCreator
	public static ProductCode fromValue(int i) {
		return Stream.of(values()).filter((productCode) -> productCode.value == i).findFirst()
				.orElseThrow(() -> new IllegalStateException("undefined value found for product code " + i));
	}

	@JsonValue
	public int toValue() {
		return this.value;
	}
}
