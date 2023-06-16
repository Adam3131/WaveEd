package com.adam.capstoneproject.data.response

import com.google.gson.annotations.SerializedName

data class UserResponse(

	@field:SerializedName("data")
	val data: List<DataItem>,

	@field:SerializedName("length")
	val length: Int,

	@field:SerializedName("status")
	val status: String
)

data class DataItem(

	@field:SerializedName("createdAt")
	val createdAt: String,

	@field:SerializedName("password")
	val password: String,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("email")
	val email: String,

	@field:SerializedName("updatedAt")
	val updatedAt: String
)
