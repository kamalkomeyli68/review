package com.company.review.product1.service.iml;

import java.util.List;

import com.company.review.core.model.ProductCommentModel;
import com.company.review.product1.service.Product1Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("product1")
public class Product1ServiceImpl implements Product1Service {

	@Override
	public boolean getEnableVoteStatus() {
		/*
		* have to implement logic for enable vote of product1
		*/
		return false;
	}

	@Override
	public boolean getEnableCommentStatus() {
		/*
		* have to implement logic for enable comment of product1
		*/
		return false;
	}

	@Override
	public List<ProductCommentModel> getLatestComment() {
		/*
		* have to implement logic for get 3 of latest comment of product1
		*/
		return null;
	}
}
