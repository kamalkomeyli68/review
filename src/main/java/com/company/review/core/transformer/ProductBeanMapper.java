package com.company.review.core.transformer;

import java.util.List;

import com.company.review.core.client.response.ProductDetailsResponse;
import com.company.review.core.model.ProductCommentModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface ProductBeanMapper {

	@Mapping(target = "enableVote", source = "enableVote")
	@Mapping(target = "enableComment", source = "enableComment")
	@Mapping(target = "comments", source = "comments")
	ProductDetailsResponse toProductDetailsResponse(boolean enableVote, boolean enableComment,
			List<ProductCommentModel> comments);
}