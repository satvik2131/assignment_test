package com.example.assignment_test.repository

import com.example.assignment_test.model.UserData
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getUsers(): Response<List<UserData>>
}