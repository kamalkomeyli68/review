package com.company.review.core.model;

import java.util.Date;

import lombok.Data;

@Data
public class ProductCommentModel {

	private String userId;

	private String title;

	private String comment;

	private Date creationDate;
}
