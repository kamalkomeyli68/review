package com.company.review.core.service;

import com.company.review.core.client.response.ProductDetailsResponse;
import com.company.review.core.model.product.ProductCode;

public interface ProductService {

	ProductDetailsResponse details(ProductCode fromValue);
}
