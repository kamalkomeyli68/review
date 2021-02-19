package com.company.review.core.service.impl;

import java.util.List;

import com.company.review.core.client.response.ProductDetailsResponse;
import com.company.review.core.model.ProductCode;
import com.company.review.core.model.ProductCommentModel;
import com.company.review.core.service.ProductProviderFactory;
import com.company.review.core.service.ProductService;
import com.company.review.core.transformer.ProductBeanMapper;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

	private final ProductProviderFactory productProviderFactory;
	private final ProductBeanMapper mapper;

	@Override
	public ProductDetailsResponse details(ProductCode productCode) {
		boolean enableVote = productProviderFactory.getProductProviderStrategy(productCode).isEnableVote();
		boolean enableComment = productProviderFactory.getProductProviderStrategy(productCode).isEnableComment();
		List<ProductCommentModel> comments = productProviderFactory.getProductProviderStrategy(productCode).getProductComment();

		return mapper.toProductDetailsResponse(enableVote, enableComment, comments);
	}
}
