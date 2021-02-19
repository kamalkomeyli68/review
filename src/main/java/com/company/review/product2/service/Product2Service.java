package com.company.review.product2.service;

import java.util.List;

import com.company.review.core.model.ProductCommentModel;

public interface Product2Service {

	boolean getEnableVoteStatus();

	boolean getEnableCommentStatus();

	List<ProductCommentModel> getLatestComment();
}
