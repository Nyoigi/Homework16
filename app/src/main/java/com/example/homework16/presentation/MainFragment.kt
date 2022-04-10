package com.example.homework16.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework16.R
import com.example.homework16.databinding.FragmentMainBinding
import com.example.homework16.recyclerview.PostAdapter
import com.example.homework16.recyclerview.models.Post


class MainFragment : Fragment() {

    private var binding: FragmentMainBinding? = null
    private val postList = listOf<Post>(
        Post(postTitle = "Нотокактус", postDescription = "Вид кактусов",
            postImageResource = R.drawable.cactus1
        ),
        Post(postTitle = "Ребуция", postDescription = "Еще один вид кактусов",
            postImageResource = R.drawable.cactus2
        ),
        Post(postTitle = "Эпифиллум", postDescription = "Колючий вид кактусов",
            postImageResource = R.drawable.cactus3
        ),
        Post(postTitle = "Цереус", postDescription = "Другой вид кактусов",
            postImageResource = R.drawable.cactus4
        ),
        Post(postTitle = "Рипсалис", postDescription = "Волнистый вид кактусов",
            postImageResource = R.drawable.cactus5
        ),
        Post(postTitle = "Маммилярии", postDescription = "Милый вид кактусов",
            postImageResource = R.drawable.cactus6
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding
            .inflate(inflater, container, false)

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = PostAdapter()
        adapter.postList = postList
        binding?.rvPost?.layoutManager = LinearLayoutManager(requireContext())
        binding?.rvPost?.adapter = adapter
    }

    override fun onDestroyView() {
        binding = null

        super.onDestroyView()
    }
}