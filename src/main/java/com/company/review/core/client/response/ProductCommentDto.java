package com.company.review.core.client.response;

import java.util.Date;

import lombok.Data;

@Data
public class ProductCommentDto {

	private String userId;

	private String title;

	private String comment;

	private Date creationDate;
}
