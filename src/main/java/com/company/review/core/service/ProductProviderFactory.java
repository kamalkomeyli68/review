package com.company.review.core.service;

import java.util.HashMap;
import java.util.List;

import com.company.review.core.model.product.ProductCode;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;


@Component
@Slf4j
public class ProductProviderFactory {

	private final HashMap<ProductCode, ProductProviderStrategy> productProviderStrategyMap;

	public ProductProviderFactory(List<ProductProviderStrategy> productProviderStrategyList) {
		productProviderStrategyMap = new HashMap<>();
		productProviderStrategyList.forEach(productProviderStrategy -> productProviderStrategyMap.putIfAbsent(productProviderStrategy.getProductCode(), productProviderStrategy));
	}

	public ProductProviderStrategy getProductProviderStrategy(ProductCode fundProviderCode) {
		logger.debug("productProviderStrategyMap is {}", productProviderStrategyMap);
		ProductProviderStrategy productProviderStrategy = productProviderStrategyMap.get(fundProviderCode);
		if (productProviderStrategy == null)
			throw new UnsupportedOperationException("product provider factory - unsupported fund provider code =" + fundProviderCode);
		return productProviderStrategy;
	}

}
