package com.company.review.product2.product;

import java.util.List;

import com.company.review.core.model.ProductCode;
import com.company.review.core.model.ProductCommentModel;
import com.company.review.core.service.ProductProviderStrategy;
import com.company.review.product2.service.Product2Service;
import lombok.AllArgsConstructor;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Profile("product2")
public class Product1ProviderStrategy implements ProductProviderStrategy {

	private final Product2Service product2Service;

	@Override
	public ProductCode getProductCode() {
		return ProductCode.PRODUCT2;
	}

	@Override
	public boolean isEnableVote() {
		return product2Service.getEnableVoteStatus();
	}

	@Override
	public boolean isEnableComment() {
		return product2Service.getEnableCommentStatus();
	}

	@Override
	public List<ProductCommentModel> getProductComment() {
		return product2Service.getLatestComment();
	}
}
