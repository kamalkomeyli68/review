package com.company.review.core.client;


import com.company.review.core.client.response.ProductDetailsResponse;
import com.company.review.core.model.ProductCode;
import com.company.review.core.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * This class has been created to implement endpoints which needs for products.
 *
 * @since version 1.0.0
 */

@Slf4j
@Service
@AllArgsConstructor
@RequestMapping("/product")
@RestController
public class ProductResource {

	private final ProductService productService;

	@PostMapping(value = "/details/{productCode}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProductDetailsResponse> details (@PathVariable("productCode") int productCode) {

		logger.info("product details request received");

		ProductDetailsResponse response = productService.details(ProductCode.fromValue(productCode));

		logger.info("trying to send product details response {}", response);

		return ResponseEntity.ok(response);
	}

}
