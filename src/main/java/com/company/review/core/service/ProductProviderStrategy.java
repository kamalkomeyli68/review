package com.company.review.core.service;

import java.util.List;

import com.company.review.core.model.ProductCode;
import com.company.review.core.model.ProductCommentModel;

public interface ProductProviderStrategy {
	ProductCode getProductCode();

	boolean isEnableVote();

	boolean isEnableComment();

	List<ProductCommentModel> getProductComment();
}
