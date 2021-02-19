package com.company.review.core.client.response;

import java.util.List;

import lombok.Data;

@Data
public class ProductDetailsResponse {

	private boolean enableVote;

	private boolean enableComment;

	private List<ProductCommentDto> comments;
}
