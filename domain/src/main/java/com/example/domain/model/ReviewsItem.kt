package com.example.domain.model

data class ReviewsItem(
	val date: String? = null,
	val reviewerName: String? = null,
	val reviewerEmail: String? = null,
	val rating: Int? = null,
	val comment: String? = null
)
