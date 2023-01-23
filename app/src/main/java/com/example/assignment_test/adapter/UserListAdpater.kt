package com.example.assignment_test.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment_test.databinding.UserCardDetailedBinding
import com.example.assignment_test.model.UserData

class UserListAdapter(private val data: List<UserData>) : RecyclerView.Adapter<UserListAdapter.ViewHolder>() {

    class ViewHolder(val binding: UserCardDetailedBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            UserCardDetailedBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.userList = data[position]
    }

    override fun getItemCount() = data.size


}

