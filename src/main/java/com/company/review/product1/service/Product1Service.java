package com.company.review.product1.service;

import java.util.List;

import com.company.review.core.model.ProductCommentModel;

public interface Product1Service {

	boolean getEnableVoteStatus();

	boolean getEnableCommentStatus();

	List<ProductCommentModel> getLatestComment();
}
