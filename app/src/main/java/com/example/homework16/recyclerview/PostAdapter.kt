package com.example.homework16.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework16.R
import com.example.homework16.recyclerview.models.Post
import kotlinx.android.synthetic.main.post_adapter_item.view.*

class PostAdapter : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    var postList = listOf<Post>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostAdapter.PostViewHolder {
        return PostViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.post_adapter_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PostAdapter.PostViewHolder, position: Int) {
        holder.bind(
            postTitle = postList[position].postTitle,
            postImageResource = postList[position].postImageResource,
            postDescription = postList[position].postDescription
        )
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(postTitle: String, postDescription: String, postImageResource: Int) {
            with(itemView) {
                ivPostPicture.setImageResource(postImageResource)
                tvPostTitle.text = postTitle
                tvPostDescription.text = postDescription
            }
        }
    }
}

