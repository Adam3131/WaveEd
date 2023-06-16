package com.adam.capstoneproject.data.retrofit

import com.adam.capstoneproject.data.response.RegisterResponse
import com.adam.capstoneproject.data.response.UserResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("users/{id}")
    @Headers("Authorization: token eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZF91c2VyIjo0MSwiZW1haWwiOiJleGFtcGxlMkBnbWFpbC5jb20iLCJpYXQiOjE2ODYxMzAxMzIsImV4cCI6MTY4ODcyMjEzMn0.vbqp0qpcoxPsoYQJurfsmNYIxEEf5tETrnWnNBPf8Bw")
    fun getUsers(
        @Path("id") username: String
    ): Call<UserResponse>

    @FormUrlEncoded
    @Headers("Authorization: token eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZF91c2VyIjo0MSwiZW1haWwiOiJleGFtcGxlMkBnbWFpbC5jb20iLCJpYXQiOjE2ODYxMzAxMzIsImV4cCI6MTY4ODcyMjEzMn0.vbqp0qpcoxPsoYQJurfsmNYIxEEf5tETrnWnNBPf8Bw")
    @POST("data")
    fun postReview(
        @Field("email") email: String,
        @Field("name") name: String,
        @Field("password") password: String,
        @Field("confPassword") confPassword: String
    ): Call<RegisterResponse>
}