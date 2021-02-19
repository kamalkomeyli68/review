package com.company.review.product2.service.iml;

import java.util.List;

import com.company.review.core.model.ProductCommentModel;
import com.company.review.product2.service.Product2Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("product2")
public class Product2ServiceImpl implements Product2Service {

	@Override
	public boolean getEnableVoteStatus() {
		/*
		* have to implement logic for enable vote of product2
		*/
		return false;
	}

	@Override
	public boolean getEnableCommentStatus() {
		/*
		* have to implement logic for enable comment of product2
		*/
		return false;
	}

	@Override
	public List<ProductCommentModel> getLatestComment() {
		/*
		* have to implement logic for get 3 of latest comment of product2
		*/
		return null;
	}
}
