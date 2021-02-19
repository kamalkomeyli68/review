package com.company.review.product1.product;

import java.util.List;

import com.company.review.core.model.ProductCode;
import com.company.review.core.model.ProductCommentModel;
import com.company.review.core.service.ProductProviderStrategy;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("product1")
public class Product1ProviderStrategy implements ProductProviderStrategy {
	@Override
	public ProductCode getProductCode() {
		return ProductCode.PRODUCT1;
	}

	@Override
	public boolean isEnableVote() {
		/*
		* have to implement logic for enable vote of product1
		*/
		return false;
	}

	@Override
	public boolean isEnableComment() {
		/*
		* have to implement logic for enable comment of product1
		*/
		return false;
	}

	@Override
	public List<ProductCommentModel> getProductComment() {
		/*
		* have to implement logic for get 3 of latest comment of product1
		*/
		return null;
	}
}
