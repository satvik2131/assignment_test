package com.example.assignment_test.view

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment_test.R
import com.example.assignment_test.adapter.UserListAdapter
import com.example.assignment_test.databinding.UserlistPreviewBinding
import com.example.assignment_test.model.UserData
import com.example.assignment_test.repository.ApiServiceImpl
import kotlinx.coroutines.runBlocking

class UserDataPreview : AppCompatActivity() {
    private lateinit var userlistBinding:UserlistPreviewBinding
    private lateinit var apiServiceImpl: ApiServiceImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        userlistBinding = DataBindingUtil.setContentView(this ,R.layout.userlist_preview);
        apiServiceImpl = ApiServiceImpl()
        val recyclerView:RecyclerView = userlistBinding.userDataRv;


        runBlocking {
            //Data
            val userData: List<UserData>? = apiServiceImpl.getUsers().body();
            val adapter = UserListAdapter(userData!!);
            recyclerView.adapter = adapter;

        }
    }
}