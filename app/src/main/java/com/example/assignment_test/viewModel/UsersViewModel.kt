package com.example.assignment_test.viewModel

import androidx.lifecycle.ViewModel
import com.example.assignment_test.repository.ApiServiceImpl

class UsersViewModel: ViewModel() {
    private val repository = ApiServiceImpl();
//    val users = repository.getUsers()
}